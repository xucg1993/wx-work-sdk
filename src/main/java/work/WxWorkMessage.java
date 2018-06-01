package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import model.WorkMessageModel;
import util.http.HttpUtil;

/**
 * 消息推送
 *
 * @author xuchenguang
 * @since 2018.05.30
 */
public class WxWorkMessage extends WxBase {

    /**
     * 文本卡片消息
     *
     * @param model
     * @return
     */
    public static JSONObject textCard(WorkMessageModel model) {
        model.setTextcard(WorkMessageModel.getMessageToMap(model));
        String map = WorkMessageModel.getMap(model);
        String result = HttpUtil.post(QyAPIUrl.MESSAGE_SEND_URL + model.getAccessToken(), map);
        logger.info("发送文本卡片消息 ：" + result);
        return JSONObject.parseObject(result);
    }

    public static void main(String[] args) {

        String text = WorkMessageModel.getDescriptionByHighlight("小鸡巴，明天在家等着朕御驾亲临");

        WorkMessageModel model = new WorkMessageModel();
        model.setAccessToken("GkkltlwkJvLI5iVRcG2bnLYQkL2zCyyeJyDRf8sahXEMj_AcKtZ2nZjg_05Ndudn142RotxMVq_yGxUkpqT3mqoaUDLYai4b5i1cCouoA1GwTr9klGsxyt2nIygRuKvCWCSZesRxtGsYZ-ygP3NPlyISZYyAdcZFnptyrWYlRg5pTyJT5kxJbeqVQ1VpplpF7Duiu7id85xXIxadZpTZMQ");
        model.setTouser("darksky");
        model.setMsgtype("textcard");
        model.setAgentid(1000002);
        model.setTitle("圣旨到，方爱卿接旨");
        model.setDescription(text);
        model.setUrl("https://www.baidu.com");
        model.setBtntxt("打开");
        textCard(model);
    }


}
