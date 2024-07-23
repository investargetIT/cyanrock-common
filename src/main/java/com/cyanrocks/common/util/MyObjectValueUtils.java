package com.cyanrocks.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


import org.springframework.util.ObjectUtils;

/**
 * 对象操作
 *
 * @author 符冬
 */
public final class MyObjectValueUtils {

    /**
     * 获取同一个类型的不同对象之间属性值不相等的字段名称和值
     *
     * @param a 对象1
     * @param b 对象2
     * @return Map<String, Object[]> <字段名称，[第一个对象的当前字段的值，第二个对象的当前字段的值]>
     */
    public final static <T> Map<String, Object[]> getDiffData(T a, T b) {
        try {
            Map<String, Object[]> dfdata = new HashMap<>();
            Field[] fds = a.getClass().getDeclaredFields();
            for (Field fd : fds) {
                fd.setAccessible(true);
                Object av = fd.get(a);
                Object bv = fd.get(b);
                boolean t = Objects.equals(av, bv);
                if (av != null && bv != null) {
                    if (av instanceof Date) {
                        Date dav = (Date) av;
                        Date dbv = (Date) bv;
                        t = Objects.compare(dav, dbv, Comparator.naturalOrder()) == 0;
                    } else if (av instanceof BigDecimal) {
                        BigDecimal dav = (BigDecimal) av;
                        BigDecimal dbv = (BigDecimal) bv;
                        t = Objects.compare(dav, dbv, Comparator.naturalOrder()) == 0;
                    }
                }

                if (!t) {
                    dfdata.put(fd.getName(), new Object[] { av, bv });
                }
            }
            return dfdata;
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    public final static Map<String, Object> getNotNullUpValues(Object o) {
        Field[] fds = o.getClass().getDeclaredFields();
        Map<String, Object> newValues = new HashMap<>(fds.length);
        for (Field fd : fds) {
            if (nomal(fd)) {
                Object propValue = getPropValue(o, fd);
                if (propValue != null) {
                    if (!fd.isAnnotationPresent(Id.class)) {
                        newValues.put(fd.getName(), propValue);
                    }
                }
            }
        }
        return newValues;
    }

    private final static Object getPropValue(Object pojo, Field fd) {
        try {
            fd.setAccessible(true);
            Object vl = fd.get(pojo);
            return vl;
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }

    public static Object getPropValue(Object pojo, String propertyName) {
        Field fd = getDeclaredAllFields(pojo.getClass()).stream().filter(f -> f.getName().equals(propertyName))
                .findAny().orElse(null);
        if (fd != null) {
            return getPropValue(pojo, fd);
        } else {
            return null;
        }

    }

    public static List<Field> getDeclaredAllFields(Class<?> clazz) {
        List<Field> dclfds = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        // 找父类的字段
        Class<?> superclass = clazz.getSuperclass();
        while (superclass != Object.class) {
            Field[] sfds = superclass.getDeclaredFields();
            for (Field sfd : sfds) {
                if (dclfds.stream().noneMatch(f -> f.getName().equals(sfd.getName()))) {
                    dclfds.add(sfd);
                }
            }
            superclass = superclass.getSuperclass();
        }

        return dclfds;
    }

    /**
     * 复制对象指定属性的值属性名称不区分大小写
     *
     * @param <N>
     * @param <T>
     * @param n
     * @param t
     * @param mappings 字段映射关系
     * @return
     */
    public final static <N, T> T copyObject(N n, T t, Map<String, String> mappings) {
        if (n != null) {
            try {
                List<Field> srcfds = getDeclaredAllFields(n.getClass());
                List<Field> tgfds = getDeclaredAllFields(t.getClass());
                srcfds = srcfds.stream().filter(f -> mappings.containsKey(f.getName())).collect(Collectors.toList());
                tgfds = tgfds.stream().filter(f -> mappings.containsValue(f.getName())).collect(Collectors.toList());
                for (Field fd : srcfds) {
                    if (nomal(fd)) {
                        Field tfd = tgfds.stream().filter(f -> f.getName().equalsIgnoreCase(mappings.get(fd.getName())))
                                .findAny().orElse(null);
                        if (tfd != null) {
                            fd.setAccessible(true);
                            tfd.setAccessible(true);
                            Object v = fd.get(n);
                            if (v != null) {
                                setNonNullValue(t, fd, tfd, v);
                            } else {
                                tfd.set(t, null);
                            }
                        }
                    }
                }
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
            return t;
        } else {
            return null;
        }
    }

    /**
     * 复制对象的值属性名称不区分大小写
     *
     * @param n 数据源
     * @param t 目标对象
     * @return 目标对象
     */
    public final static <N, T> T copyObject(N n, T t) {
        if (n != null) {
            try {
                List<Field> srcfds = getDeclaredAllFields(n.getClass());
                List<Field> tgfds = getDeclaredAllFields(t.getClass());
                for (Field fd : srcfds) {
                    if (nomal(fd)) {
                        Field tfd = tgfds.stream().filter(f -> f.getName().equalsIgnoreCase(fd.getName())).findAny()
                                .orElse(null);
                        if (tfd != null) {
                            fd.setAccessible(true);
                            tfd.setAccessible(true);
                            Object v = fd.get(n);
                            if (v != null) {
                                setNonNullValue(t, fd, tfd, v);
                            } else {
                                tfd.set(t, null);
                            }
                        }
                    }
                }
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
            return t;
        } else {
            return null;
        }
    }

    private static <T> void setNonNullValue(T t, Field fd, Field tfd, Object v) throws IllegalAccessException {
        if (tfd.getType() == fd.getType()) {
            tfd.set(t, v);
        } else if (v != null) {
            if (fd.getType() == Boolean.class) {
                Boolean bl = (Boolean) v;
                if (tfd.getType() == Byte.class) {
                    if (bl) {
                        tfd.set(t, Byte.valueOf("1"));
                    } else {
                        tfd.set(t, Byte.valueOf("0"));
                    }
                } else if (tfd.getType() == String.class) {
                    if (bl) {
                        tfd.set(t, "1");
                    } else {
                        tfd.set(t, "0");
                    }
                } else {
                    tfd.set(t, v);
                }
            } else if (fd.getType() == Byte.class) {
                Byte b = (Byte) v;
                if (tfd.getType() == Boolean.class) {
                    if (b == 1) {
                        tfd.set(t, true);
                    } else {
                        tfd.set(t, false);
                    }
                } else if (tfd.getType() == Integer.class) {
                    tfd.set(t, b.intValue());
                } else {
                    tfd.set(t, v);
                }
            } else if (fd.getType() == Double.class && tfd.getType() == BigDecimal.class) {
                Double dbl = (Double) v;
                tfd.set(t, new BigDecimal(Double.toString(dbl)));
            } else if (fd.getType() == BigDecimal.class) {
                BigDecimal bd = (BigDecimal) v;
                if (tfd.getType() == Double.class) {
                    tfd.set(t, bd.doubleValue());
                } else {
                    tfd.set(t, v);
                }
            } else if (fd.getType() == Integer.class) {
                Integer i = (Integer) v;
                if (tfd.getType() == Byte.class) {
                    tfd.set(t, i.byteValue());
                } else if (tfd.getType() == String.class) {
                    tfd.set(t, String.valueOf(i));
                } else {
                    tfd.set(t, v);
                }
            } else if (fd.getType() == Date.class && tfd.getType() == String.class) {
                Date dt = (Date) v;
                tfd.set(t, MyDateUtils.getDate(dt));
            } else if (fd.getType() == String.class && tfd.getType() == Date.class) {
                tfd.set(t, MyDateUtils.getDate(v.toString()));
            } else if (fd.getType() == Double.class && tfd.getType() == String.class) {
                tfd.set(t, String.valueOf(v));
            } else if (fd.getType() == String.class && tfd.getType() == Double.class) {
                if (checkValuesNotNullAndEmpty(v.toString())) {
                    tfd.set(t, Double.valueOf(v.toString()));
                }
            } else if (fd.getType() == String.class && tfd.getType() == Integer.class) {
                if (checkValuesNotNullAndEmpty(v.toString())) {
                    tfd.set(t, Integer.valueOf(v.toString()));
                }
            } else if (fd.getType() == Long.class && tfd.getType() == Integer.class) {
                Long llv = (Long) v;
                tfd.set(t, llv.intValue());
            } else {
                tfd.set(t, v);
            }
        }
    }

    /**
     * 复制对象的非null值属性名称不区分大小写
     *
     * @param n 数据源
     * @param t 目标对象
     * @return 目标对象
     */
    public final static <N, T> T copyObjectNonNullValue(N n, T t) {
        if (n != null) {
            try {
                List<Field> srcfds = getDeclaredAllFields(n.getClass());
                List<Field> tgfds = getDeclaredAllFields(t.getClass());
                for (Field fd : srcfds) {
                    if (nomal(fd)) {
                        Field tfd = tgfds.stream().filter(f -> f.getName().equalsIgnoreCase(fd.getName())).findAny()
                                .orElse(null);
                        if (tfd != null) {
                            fd.setAccessible(true);
                            tfd.setAccessible(true);
                            Object v = fd.get(n);
                            if (v != null) {
                                setNonNullValue(t, fd, tfd, v);
                            }
                        }
                    }
                }
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
            return t;
        } else {
            return null;
        }
    }

    /**
     * 检测所有值是否都不为空
     *
     * @param objs
     * @return
     */
    public static boolean checkValuesNotNullAndEmpty(Object... objs) {
        for (Object o : objs) {
            if (ObjectUtils.isEmpty(o)) {
                return false;
            } else if (o instanceof String) {
                if (((String) o).trim().length() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /***
     * 根据对象数组创建MAP
     *
     * @param kvs
     * @return
     */
    public static Map<String, Object> getMap(Object... kvs) {
        if (kvs != null && kvs.length > 1) {
            LinkedHashMap<String, Object> mps = new LinkedHashMap<>(kvs.length / 2);
            for (int i = 0; i < kvs.length - 1; i = i + 2) {
                mps.put(kvs[i].toString(), kvs[i + 1]);
            }
            return mps;
        } else {
            return new LinkedHashMap<>(0);
        }
    }

    /**
     * 是否可以复制
     *
     * @param fd
     * @return
     */
    private static boolean nomal(Field fd) {
        return !Modifier.isFinal(fd.getModifiers()) && !Modifier.isStatic(fd.getModifiers());
    }

    // 为了首字母的大写
    public static String initStr(String a) {
        String b = a.substring(0, 1).toUpperCase() + a.substring(1);
        return b;
    }

}
