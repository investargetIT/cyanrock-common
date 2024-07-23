package com.cyanrocks.common.em.oms.so;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 销售订单类型枚举
 */
public enum SalesOrderCategoryEnum {

    SALES_ORDER(10, "普通销售订单", "YOR"),
    INTELLIGENT_CABINET(20, "寄售结算订单", "YKE"),
    YKB(30, "寄售补货订单", "YKB"),
    YKA(40, "寄售退回订单", "YKA"),
    ;

    // 状态
    private Integer category;
    // 描述
    private String categoryName;
    // SAP 订单类型
    private String sapCode;

    public Integer getCategory() {
        return category;
    }

    public String getSapCode() {
        return sapCode;
    }

    SalesOrderCategoryEnum(Integer category, String categoryName, String sapCode) {
        this.category = category;
        this.categoryName = categoryName;
        this.sapCode = sapCode;
    }

    public static SalesOrderCategoryEnum getByCategory(Integer category) {
        return Arrays.asList(SalesOrderCategoryEnum.values()).stream().filter(o -> o.getCategory().equals(category))
                .findAny().orElse(null);
    }

    public final static String getCategoryName(Integer category) {
        for (SalesOrderCategoryEnum os : SalesOrderCategoryEnum.values()) {
            if (os.getCategory().equals(category)) {
                return os.getCategoryName();
            }
        }
        return "";
    }

    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 将枚举对象转为List<Map>
     *
     * @return
     */
    public static List<Map<String, Object>> getListMap() {
        List<Map<String, Object>> mapList = Arrays.stream(SalesOrderCategoryEnum.values()).map(it -> {
            Map<String, Object> apiMap = new HashMap<>();
            apiMap.put("key", it.getCategory());
            apiMap.put("desc", it.getCategoryName());
            return apiMap;
        }).collect(Collectors.toList());
        return mapList;
    }

    /**
     * 将枚举对象转为Map
     *
     * @return
     */
    public static Map<Integer, Object> getMap() {
        return Arrays.stream(SalesOrderCategoryEnum.values()).collect(
                Collectors.toMap(SalesOrderCategoryEnum::getCategory, SalesOrderCategoryEnum::getCategoryName));
    }
}
