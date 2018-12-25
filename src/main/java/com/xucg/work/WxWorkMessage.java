package com.xucg.work;

import com.alibaba.fastjson.JSONObject;
import com.xucg.config.QyAPIUrl;
import com.xucg.model.WorkMessageModel;
import com.xucg.util.http.HttpUtil;

import java.text.SimpleDateFormat;
import java.util.*;

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


    public static JSONObject miniProgramNotice(WorkMessageModel model) {
        model.setMiniprogram_notice(WorkMessageModel.getMessageToMap(model));
        String map = WorkMessageModel.getMap(model);
        String result = HttpUtil.post(QyAPIUrl.MESSAGE_SEND_URL + model.getAccessToken(), map);
        logger.info("发送微信小程序消息 ：" + result);
        return JSONObject.parseObject(result);
    }

//    public static void main(String[] args) {
//
//        String text = WorkMessageModel.getDescriptionByHighlight("小鸡巴，明天在家等着朕御驾亲临");
//
//        WorkMessageModel model = new WorkMessageModel();
//        model.setAccessToken("kvgWYJwBLgMmUUByVSiuKVCbJKpEjY9qKuV5Ya9yXRwCJdS32coO7fs3bqw9g1MAK2HIOarGGdqZar_LseswetKxMqkvF9BVLwCxDK_PmvR1EtDEZLYtDvyminJ5EadsLbgKRdnfEnPLJif1RbzAl-wZPIPyzUs9CjNBk7pqEd__C89mru0UNc4l2CD3snQPr_uAexQ7Do7rRT3wuuJZ7Q");
//        model.setTouser("darksky|XuChenGuang");
//        model.setMsgtype("textcard");
//        model.setAgentid(1000002);
//        model.setTitle("圣旨到，方爱卿接旨");
//        model.setDescription(text);
//        model.setUrl("https://www.baidu.com");
//        model.setBtntxt("打开");
//        textCard(model);
//    }

    public static void main(String[] args) {

        WorkMessageModel model = new WorkMessageModel();
        model.setAccessToken("b5pfc9_oB-gLXPUyADkqjhV5Sn0BaEcI1AHwUJS3VcYzv2P7fwYsATTl80JCiNi9C1cZ6b9FCkA7WrNV9NTzGXFEgphujKkQX43cRXg1QWf5q5H4duxkxxP3f0u2Wi3ducdvRp3UwXGFyunlNzB-h2dl8BjJQt0I2t06gUrdtxdClKbzXfQPCJtip7TPeq_0CAkI59sePssnefc3rbITbA");
        model.setTouser("darksky|XuChenGuang");
        model.setMsgtype("miniprogram_notice");
        model.setAppid("wx6517d517c844dd15");
        model.setPage("/pages/bissness/bissness");
        model.setTitle("用户拼团下单通知");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        model.setDescription(dateFormat.format(new Date()));
        model.setContent_item(WorkMessageModel.buildContentItem("用户名称,徐晨光|订单金额,100元|商品,XX洗衣液 * 1|收货地址,河南省商丘市睢阳区天明第一城"));
        miniProgramNotice(model);
    }
}