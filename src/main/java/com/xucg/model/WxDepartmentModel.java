package com.xucg.model;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门
 *
 * @author xuchenguang
 * @since 2018.05.31
 */
public class WxDepartmentModel extends Common {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 父部门id
     */
    private Integer parentId;
    /**
     * 在父部门中的次序值
     */
    private Integer order;
    /**
     * 部门id
     */
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param model
     * @return
     */
    public static String getMap(WxDepartmentModel model) {
        Map<String, Object> data = new HashMap<>(16);
        if (StringUtils.isNotBlank(model.getName())) {
            data.put("name", model.getName());
        }
        if (model.getParentId() != null) {
            data.put("parentid", model.getParentId());
        }
        if (model.getOrder() != null) {
            data.put("order", model.getOrder());
        }
        if (model.getId() != null) {
            data.put("id", model.getId());
        }
        return JSONObject.toJSONString(data);
    }
}
