package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import config.QyWorkConfig;
import model.User;
import util.http.HttpUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * 企业微信
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class WxWork {

    /**
     * 获取access_token
     *
     * @param corpId     企业ID
     * @param corpSecret 应用的凭证密钥
     * @return
     */
    public static JSONObject getToken(String corpId, String corpSecret) {
        Map<String, String> map = new HashMap<>(16);
        map.put("corpid", corpId);
        map.put("corpsecret", corpSecret);
        return JSONObject.parseObject(HttpUtil.get(QyAPIUrl.GET_TOKEN_URL, map));
    }


    public static void main(String[] args) {
        JSONObject token = getToken(QyWorkConfig.CORP_ID, QyWorkConfig.MAIL_LIST_SECRET);
        System.out.println(token);
    }
}
