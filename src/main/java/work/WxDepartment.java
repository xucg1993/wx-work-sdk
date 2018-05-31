package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import model.WxDepartmentModel;
import util.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门管理
 *
 * @author xuchenguang
 * @since 2018.05.31
 */
public class WxDepartment extends WxBase {

    /**
     * 获取部门列表
     *
     * @param accessToken
     * @param id
     * @return
     */
    public static JSONObject list(String accessToken, String id) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(Id, id);
        String result = HttpUtil.get(QyAPIUrl.DEPARTMENT_LIST_URL, data);
        logger.info("获取部门列表 ： " + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 创建部门
     *
     * @param model
     * @return
     */
    public static JSONObject create(WxDepartmentModel model) {
        String map = WxDepartmentModel.getMap(model);
        String result = HttpUtil.post(QyAPIUrl.DEPARTMENT_CREATE_URL + model.getAccessToken(), map);
        logger.info("创建部门：" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 更新部门
     *
     * @param model
     * @return
     */
    public static JSONObject update(WxDepartmentModel model) {
        String map = WxDepartmentModel.getMap(model);
        String result = HttpUtil.post(QyAPIUrl.DEPARTMENT_UPDATE_URL + model.getAccessToken(), map);
        logger.info("更新部门：" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 删除部门
     *
     * @param accessToken
     * @param id
     * @return
     */
    public static JSONObject delete(String accessToken, String id) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(Id, id);
        String result = HttpUtil.post(QyAPIUrl.DEPARTMENT_DELETE_URL, data);
        logger.info("删除部门：" + result);
        return JSONObject.parseObject(result);
    }


}
