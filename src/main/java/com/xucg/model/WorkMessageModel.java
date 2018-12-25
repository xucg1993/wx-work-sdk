package com.xucg.model;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
     *
     */
    private Map<String, Object> miniprogram_notice;

    /**
     * 小程序appid，必须是与当前小程序应用关联的小程序
     */
    private String appid;
    /**
     * 点击消息卡片后的小程序页面，仅限本小程序内的页面。该字段不填则消息点击后不跳转
     */
    private String page;
    /**
     * 是否放大第一个content_item
     */
    private Boolean emphasis_first_item = new Boolean(false);
    /**
     * 消息内容键值对，最多允许10个item
     */
    private List content_item;


    /**
     * 消息
     */
    private Map<String, Object> textcard;

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

    public Map<String, Object> getTextcard() {
        return textcard;
    }

    public void setTextcard(Map<String, Object> textcard) {
        this.textcard = textcard;
    }

    public Map<String, Object> getMiniprogram_notice() {
        return miniprogram_notice;
    }

    public void setMiniprogram_notice(Map<String, Object> miniprogram_notice) {
        this.miniprogram_notice = miniprogram_notice;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Boolean getEmphasis_first_item() {
        return emphasis_first_item;
    }

    public void setEmphasis_first_item(Boolean emphasis_first_item) {
        this.emphasis_first_item = emphasis_first_item;
    }

    public List getContent_item() {
        return content_item;
    }

    public void setContent_item(List content_item) {
        this.content_item = content_item;
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
        if (model.getMiniprogram_notice() != null) {
            data.put("miniprogram_notice", model.getMiniprogram_notice());
        }

        return JSONObject.toJSONString(data);
    }


    public static Map<String, Object> getMessageToMap(WorkMessageModel model) {
        Map<String, Object> data = new HashMap<>(16);

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
        if (StringUtils.isNotBlank(model.getAppid())) {
            data.put("appid", model.getAppid());
        }
        if (StringUtils.isNotBlank(model.getPage())) {
            data.put("page", model.getPage());
        }
        if (model.getEmphasis_first_item()) {
            data.put("emphasis_first_item", model.getEmphasis_first_item());
        }else {
            data.put("emphasis_first_item", model.getEmphasis_first_item());
        }
        if (!model.getContent_item().isEmpty()) {
            data.put("content_item", model.getContent_item());
        }
        return data;
    }

    /**
     *
     */
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


    /**
     * 封装消息内容键值对
     * 小程序通知
     *
     * @param text
     * @return
     */
    public static List<Map<String, String>> buildContentItem(String text) {

        String[] split = text.split("\\|");

        List<Map<String, String>> list = new ArrayList();

        for (String s : split) {
            String[] strings = s.split(",");
            HashMap<String, String> map = new HashMap<>();
            map.put("key", strings[0]);
            map.put("value", strings[1]);
            list.add(map);
        }

        return list;
    }
}
