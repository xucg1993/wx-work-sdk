package model;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

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
    private String parentId;
    /**
     * 在父部门中的次序值
     */
    private String order;
    /**
     * 部门id
     */
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param model
     * @return
     */
    public static String getMap(WxDepartmentModel model) {
        Map<String, String> data = new HashMap<>(16);
        if (StringUtils.isNotBlank(model.getName())) {
            data.put("name", model.getName());
        }
        if (StringUtils.isNotBlank(model.getParentId())) {
            data.put("parentid", model.getParentId());
        }
        if (StringUtils.isNotBlank(model.getOrder())) {
            data.put("order", model.getOrder());
        }
        if (StringUtils.isNotBlank(model.getId())) {
            data.put("id", model.getId());
        }
        return JSONObject.toJSONString(data);
    }
}
