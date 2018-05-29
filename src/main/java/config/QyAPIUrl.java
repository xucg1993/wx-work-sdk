package config;

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


}
