package com.xucg.model;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息推送
 *
 * @author xuchenguang
 * @since 2018.05.30
 */
public class WorkMessageModel extends Common {
    /**
     * 成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）
     */
    private String touser;
    /**
     * 部门ID列表，多个接收者用‘|’分隔，最多支持100个
     */
    private String toparty;
    /**
     * 标签ID列表，多个接收者用‘|’分隔，最多支持100个
     */
    private String totag;
    /**
     * 消息类型
     */
    private String msgtype;
    /**
     * 企业应用的id
     */
    private Integer agentid;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 点击后跳转的链接
     */
    private String url;
    /**
     * 按钮文字。 默认为“详情” 不超过4个文字
     */
    private String btntxt;

    /**
     * 消息
     */
    private Map<String, String> textcard;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(String toparty) {
        this.toparty = toparty;
    }

    public String getTotag() {
        return totag;
    }

    public void setTotag(String totag) {
        this.totag = totag;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBtntxt() {
        return btntxt;
    }

    public void setBtntxt(String btntxt) {
        this.btntxt = btntxt;
    }

    public Map<String, String> getTextcard() {
        return textcard;
    }

    public void setTextcard(Map<String, String> textcard) {
        this.textcard = textcard;
    }

    /**
     * @param model
     * @return
     */
    public static String getMap(WorkMessageModel model) {
        Map<String, Object> data = new HashMap<>(16);

        if (StringUtils.isNotBlank(model.getTouser())) {
            data.put("touser", model.getTouser());
        }

        if (StringUtils.isNotBlank(model.getToparty())) {
            data.put("toparty", model.getToparty());
        }

        if (StringUtils.isNotBlank(model.getTotag())) {
            data.put("totag", model.getTotag());
        }

        if (StringUtils.isNotBlank(model.getMsgtype())) {
            data.put("msgtype", model.getMsgtype());
        }

        if (model.getAgentid() != null) {
            data.put("agentid", model.getAgentid());
        }

        if (model.getTextcard() != null) {
            data.put("textcard", model.getTextcard());
        }

        return JSONObject.toJSONString(data);
    }


    public static Map<String, String> getMessageToMap(WorkMessageModel model) {
        Map<String, String> data = new HashMap<>(16);

        if (StringUtils.isNotBlank(model.getTitle())) {
            data.put("title", model.getTitle());
        }
        if (StringUtils.isNotBlank(model.getDescription())) {
            data.put("description", model.getDescription());
        }
        if (StringUtils.isNotBlank(model.getUrl())) {
            data.put("url", model.getUrl());
        }
        if (StringUtils.isNotBlank(model.getBtntxt())) {
            data.put("btntxt", model.getBtntxt());
        }
        return data;
    }


    public static String getDescriptionByNormal(String text) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class=\"normal\">").append(text).append("</div>");
        return buffer.toString();
    }

    public static String getDescriptionByGray(String text) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class=\"gray\">").append(text).append("</div>");
        return buffer.toString();
    }

    public static String getDescriptionByHighlight(String text) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class=\"highlight\">").append(text).append("</div>");
        return buffer.toString();
    }
}
