package com.xiaot.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaot.common.enums.DeleteEnum;
import com.xiaot.common.util.JsonUtil;
import org.junit.jupiter.api.Test;

/**
 * @author xiaoT
 */
public class DeleteEnumTest {

    @Test
    void enumsTest() throws JsonProcessingException {
        System.out.println(JsonUtil.toJson(DeleteEnum.enums()));
    }

}
