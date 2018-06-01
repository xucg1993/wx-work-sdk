package com.xucg.config;

/**
 * 企业api接口
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class QyAPIUrl {

    /**
     * 获取access_token
     * GET
     * corpid 企业ID
     * corpsecret 应用的凭证密钥
     */
    public static final String GET_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/gettoken";

    /**
     * 创建成员
     * POST
     * access_token
     */
    public static final String USER_CREATE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=";

    /**
     * 读取成员
     * GET
     * access_token
     * userid
     */
    public static final String USER_GET_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get";

    /**
     * 更新成员
     * POST
     * access_token
     */
    public static final String USER_UPDATE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=";

    /**
     * 删除成员
     * GET
     * access_token
     * userid
     */
    public static final String USER_DELETE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/delete";

    /**
     * 批量删除成员
     * POST
     * access_token
     */
    public static final String USER_BATCH_DELETE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token=";

    /**
     * 获取部门成员
     * GET
     * access_token
     * department_id
     * fetch_child
     */
    public static final String USER_SIMPLE_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/simplelist";

    /**
     * 获取部门成员详情
     * GET
     * access_token
     * department_id
     * fetch_child
     */
    public static final String USER_USER_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/list";

    /**
     * 发送应用消息
     * access_token
     */
    public static final String MESSAGE_SEND_URL = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";


    /**
     * 获取部门列表
     * GET
     * access_token
     * id
     */
    public static final String DEPARTMENT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/list";

    /**
     * 创建部门
     * POST
     * access_token
     */
    public static final String DEPARTMENT_CREATE_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=";

    /**
     * 更新部门
     * POST
     * access_token
     */
    public static final String DEPARTMENT_UPDATE_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/update?access_token=";

    /**
     * 删除部门
     * GET
     * access_token
     * id
     */
    public static final String DEPARTMENT_DELETE_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/delete";


}
