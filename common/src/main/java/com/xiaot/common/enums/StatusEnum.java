package com.xiaot.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 * 状态
 */
public enum StatusEnum {

    /**
     * 注销
     */
    LOGOUT(0, "注销"),

    /**
     * 正常
     */
    NORMAL(1, "正常"),

    /**
     * 黑名单
     */
    BLACKLIST(2, "黑名单")
    ;

    /**
     * key
     */
    private Integer id;

    /**
     * 状态
     */
    private String name;

    public static List<Map<String, Object>> enums() {
        List<Map<String, Object>> enumList = new ArrayList<>();
        for (StatusEnum e : values()) {
            Map<String, Object> enumMap = new HashMap<>();
            enumMap.put("id", e.id);
            enumMap.put("name", e.name);
            enumList.add(enumMap);
        }
        return enumList;
    }

    StatusEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
