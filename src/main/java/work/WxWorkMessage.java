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

        String text = WorkMessageModel.getDescriptionByHighlight("收货人：傻逼小鸡")
                + WorkMessageModel.getDescriptionByHighlight("手机号：15082985491")
                + WorkMessageModel.getDescriptionByHighlight("收货地址：河南省商丘市梁园区")
                + WorkMessageModel.getDescriptionByHighlight("商品详情：xxx商品 x 2")
                + WorkMessageModel.getDescriptionByHighlight("订单金额：15元")
                + WorkMessageModel.getDescriptionByHighlight("订单编号：201805301239891200001");

        WorkMessageModel model = new WorkMessageModel();
        model.setAccessToken("CWNCYds-G66nt0SIfLQBFLG_zoF4Nf_Y885KLu0qQ8qDkT6ElrZY-uS-ChJknBLTvHnwp5D2D15KkHBvO8Rwb0AZAyXvAAeaT7hdsRO8eeah0SwyCUPqqAFO2lbF5wfdhxyCWGQd4jDjRij9XTC9XZWRE3o14GeD2r-NnyOu4jFnd1DUENocUy9eyhTwXNCvvbSt22e4sQK1r_CS0QyNdQ");
        model.setTouser("darksky");
        model.setMsgtype("textcard");
        model.setAgentid(1000002);
        model.setTitle("您有新的订单，请注意查收");
        model.setDescription(text);
        model.setUrl("https://www.baidu.com");
        model.setBtntxt("打开");
        textCard(model);
    }


}
