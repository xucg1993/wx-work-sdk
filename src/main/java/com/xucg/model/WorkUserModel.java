package com.xucg.model;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 成员
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class WorkUserModel extends Common {


    /**
     * 成员UserID
     * userid
     */
    private String userId;
    /**
     * 成员名称
     */
    private String name;
    /**
     * 英文名
     * english_name
     */
    private String englishName;
    /**
     * 手机号码
     * mobile/email二者不能同时为空
     */
    private String mobile;
    /**
     * 成员所属部门id列表
     */
    private Integer[] department;
    /**
     * 部门内的排序值 默认为0
     */
    private Integer[] order;
    /**
     * 职位信息
     */
    private String position;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 座机
     */
    private String telephone;
    /**
     * 上级字段
     * isleader
     */
    private Integer isLeader;
    /**
     * 成员头像的mediaid
     * avatar_mediaid
     */
    private String avatarMediaid;
    /**
     * 启用/禁用成员
     */
    private Integer enable;
    /**
     * 自定义字段
     */
    private String extattr;
    /**
     * 是否邀请该成员使用企业微信
     * to_invite
     */
    private Boolean toInvite;
    /**
     * 成员对外属性
     * external_profile
     */
    private String externalProfile;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer[] getDepartment() {
        return department;
    }

    public void setDepartment(Integer[] department) {
        this.department = department;
    }

    public Integer[] getOrder() {
        return order;
    }

    public void setOrder(Integer[] order) {
        this.order = order;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public String getAvatarMediaid() {
        return avatarMediaid;
    }

    public void setAvatarMediaid(String avatarMediaid) {
        this.avatarMediaid = avatarMediaid;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getExtattr() {
        return extattr;
    }

    public void setExtattr(String extattr) {
        this.extattr = extattr;
    }

    public Boolean getToInvite() {
        return toInvite;
    }

    public void setToInvite(Boolean toInvite) {
        this.toInvite = toInvite;
    }

    public String getExternalProfile() {
        return externalProfile;
    }

    public void setExternalProfile(String externalProfile) {
        this.externalProfile = externalProfile;
    }


    public static String getMap(WorkUserModel user) {
        Map<String, Object> data = new HashMap<>(16);
        if (StringUtils.isNotBlank(user.getUserId())) {
            data.put("userid", user.getUserId());
        }

        if (StringUtils.isNotBlank(user.getName())) {
            data.put("name", user.getName());
        }

        if (StringUtils.isNotBlank(user.getMobile())) {
            data.put("mobile", user.getMobile());
        }
        if (user.getDepartment() != null) {
            data.put("department", user.getDepartment());
        }
        return JSONObject.toJSONString(data);
    }
}
