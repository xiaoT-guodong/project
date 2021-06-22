package com.xiaot.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
public class BaseController {

    /**
     * 基础返回格式
     * @param code 状态码
     * @param msg 信息
     * @param data 数据
     * @return {<br/>&nbsp;&nbsp;"code":...,<br/>&nbsp;&nbsp;"msg":"...",<br/>&nbsp;&nbsp;"data":...<br/>}
     */
    private Map<String, Object> baseResult(Integer code, String msg, Object data) {
        Map<String, Object> result = new HashMap<>(3);
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }

    /**
     * 成功返回格式
     * @param msg 信息
     * @param data 数据
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"...",<br/>&nbsp;&nbsp;"data":...<br/>}
     */
    public Map<String, Object> success(String msg, Object data) {
        return baseResult(200, msg, data);
    }

    /**
     * 成功返回格式
     * @param msg 信息
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"...",<br/>&nbsp;&nbsp;"data":null<br/>}
     */
    public Map<String, Object> success(String msg) {
        return success(msg, null);
    }

    /**
     * 成功返回格式
     * @param data 数据
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"成功",<br/>&nbsp;&nbsp;"data":...<br/>}
     */
    public Map<String, Object> success(Object data) {
        return success("成功", data);
    }

    /**
     * 成功返回格式
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"成功",<br/>&nbsp;&nbsp;"data":null<br/>}
     */
    public Map<String, Object> success() {
        return baseResult(200, "成功", null);
    }

    /**
     * 分页基础数据格式
     * @param total
     * @param data
     * @return {<br/>&nbsp;&nbsp;"total":...,<br/>&nbsp;&nbsp;"data":[...]<br/>}
     */
    private Map<String, Object> basePage(Integer total, List<?> data) {
        Map<String, Object> page = new HashMap<>();
        page.put("total", total);
        page.put("data", data);
        return page;
    }

    /**
     * 分页返回格式
     * @param msg 信息
     * @param total 总条数
     * @param data 数据列表
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"...",<br/>&nbsp;&nbsp;"data":{<br/>&nbsp;&nbsp;
     *          &nbsp;&nbsp;&nbsp;&nbsp;"total":...,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"data":[...]<br/>
     *          &nbsp;&nbsp;&nbsp;&nbsp;}<br/>}
     */
    public Map<String, Object> page(String msg, Integer total, List<?> data) {
        return success(msg, basePage(total, data));
    }

    /**
     * 分页返回格式
     * @param total 总条数
     * @param data 数据列表
     * @return {<br/>&nbsp;&nbsp;"code":200,<br/>&nbsp;&nbsp;"msg":"成功",<br/>&nbsp;&nbsp;"data":{<br/>&nbsp;&nbsp;
     *          &nbsp;&nbsp;&nbsp;&nbsp;"total":...,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"data":[...]<br/>
     *          &nbsp;&nbsp;&nbsp;&nbsp;}<br/>}
     */
    public Map<String, Object> page(Integer total, List<?> data) {
        return success("成功", basePage(total, data));
    }

    /**
     * 失败返回格式
     * @param code
     * @param msg
     * @return {<br/>&nbsp;&nbsp;"code":...,<br/>&nbsp;&nbsp;"msg":"...",<br/>&nbsp;&nbsp;"data":null<br/>}
     */
    public Map<String, Object> fail(Integer code, String msg) {
        return baseResult(code, msg, null);
    }

}
