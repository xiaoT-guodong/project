package com.xiaot.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author xiaoT
 */
public class JsonUtil {

    /**
     * 将数据转换成json字符串
     * @param o 需要转换的数据
     * @return json字符串
     * @throws JsonProcessingException 转换异常
     */
    public static String toJson(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(o);
    }

}
