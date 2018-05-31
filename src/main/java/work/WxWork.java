package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import config.QyWorkConfig;
import util.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 企业微信
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class WxWork extends WxBase {


    /**
     * 获取access_token
     *
     * @param corpId     企业ID
     * @param corpSecret 应用的凭证密钥
     * @return
     */
    public static JSONObject getToken(String corpId, String corpSecret) {
        Map<String, String> map = new HashMap<>(16);
        map.put(CORP_ID, corpId);
        map.put(CORPSE_CRET, corpSecret);
        String result = HttpUtil.get(QyAPIUrl.GET_TOKEN_URL, map);
        logger.info("获取access_token ： " + result);
        return JSONObject.parseObject(result);
    }


    public static void main(String[] args) {
        JSONObject token = getToken(QyWorkConfig.CORP_ID, QyWorkConfig.ORDER_SECRET);
    }
}
