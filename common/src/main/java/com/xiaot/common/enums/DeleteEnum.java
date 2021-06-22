package com.xiaot.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
public enum DeleteEnum {

    /**
     * 未删除
     */
    NO(0, "未删除"),

    /**
     * 已删除
     */
    YES(1, "已删除")
    ;

    /**
     * key
     */
    private Integer id;

    /**
     * 是否删除
     */
    private String name;

    public static List<Map<String, Object>> enums() {
        List<Map<String, Object>> enumList = new ArrayList<>();
        for (DeleteEnum e : values()) {
            Map<String, Object> enumMap = new HashMap<>();
            enumMap.put("id", e.id);
            enumMap.put("name", e.name);
            enumList.add(enumMap);
        }
        return enumList;
    }

    DeleteEnum(Integer id, String name) {
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
