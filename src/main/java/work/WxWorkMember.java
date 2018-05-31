package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import model.WorkUserModel;
import org.apache.commons.lang3.StringUtils;
import util.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 成员管理
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class WxWorkMember extends WxBase {


    /**
     * 创建成员
     *
     * @param user
     * @return
     */
    public static JSONObject create(WorkUserModel user) {
        String map = WorkUserModel.getMap(user);
        String result = HttpUtil.post(QyAPIUrl.USER_CREATE_URL + user.getAccessToken(), map);
        logger.info("创建成员：" + result);
        return JSONObject.parseObject(result);
    }


    /**
     * 读取成员
     *
     * @param accessToken
     * @param userId
     * @return
     */
    public static JSONObject get(String accessToken, String userId) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(USER_ID, userId);
        String result = HttpUtil.get(QyAPIUrl.USER_GET_URL, data);
        logger.info("读取成员 ：" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 更新成员
     *
     * @param
     */
    public static JSONObject update(WorkUserModel model) {
        String map = WorkUserModel.getMap(model);
        String result = HttpUtil.post(QyAPIUrl.USER_UPDATE_URL + model.getAccessToken(), map);
        logger.info("更新成员：" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 删除成员
     *
     * @param accessToken
     * @param userId
     * @return
     */
    public static JSONObject delete(String accessToken, String userId) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(USER_ID, userId);
        String result = HttpUtil.get(QyAPIUrl.USER_DELETE_URL, data);
        logger.info("删除成员" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 批量删除成员
     *
     * @param accessToken
     * @param userIds
     * @return
     */
    public static JSONObject batchDelete(String accessToken, String... userIds) {
        Map<String, String[]> data = new HashMap<>(16);
        data.put(USER_ID_LIST, userIds);
        String result = HttpUtil.post(QyAPIUrl.USER_BATCH_DELETE_URL + accessToken, JSONObject.toJSONString(data));
        logger.info("批量删除成员" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 获取部门成员
     *
     * @param accessToken
     * @param departmentId
     * @param fetchChild
     * @return
     */
    public static JSONObject simpleList(String accessToken, String departmentId, String fetchChild) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(DEPARTMENT_ID, departmentId);
        if (StringUtils.isNotBlank(fetchChild)) {
            data.put(FETCH_CHILD, fetchChild);
        } else {
            data.put(FETCH_CHILD, ONE);
        }
        String result = HttpUtil.get(QyAPIUrl.USER_SIMPLE_LIST_URL, data);
        logger.info("获取部门成员 ：" + result);
        return JSONObject.parseObject(result);
    }

    /**
     * 获取部门成员详情
     *
     * @param accessToken
     * @param departmentId
     * @param fetchChild
     * @return
     */
    public static JSONObject userListInfo(String accessToken, String departmentId, String fetchChild) {
        Map<String, String> data = new HashMap<>(16);
        data.put(ACCESS_TOKEN, accessToken);
        data.put(DEPARTMENT_ID, departmentId);
        if (StringUtils.isNotBlank(fetchChild)) {
            data.put(FETCH_CHILD, fetchChild);
        } else {
            data.put(FETCH_CHILD, ONE);
        }
        String result = HttpUtil.get(QyAPIUrl.USER_USER_LIST_URL, data);
        logger.info("获取部门成员详情：" + result);
        return JSONObject.parseObject(result);
    }


    public static void main(String[] args) {
//        WorkUserModel user = new WorkUserModel();
//        user.setUserId("123");
//        user.setName("测试");
//        user.setMobile("17600381103");
//        user.setDepartment(new Integer[]{2});
//        create(user);
        String s = "k6JgurIfdQ7U-XQ7oPZC-4nd1kuMa59Nqe-XrvPgRV5onOavm5e66QeA6OpsF8Dm2j90p4DGzwZqUR_1iYsDjLqfEWrbZnGWg4kogkMS4m6oOTqYBiA2Yi-dUWsptQmjsQs7FiV5g4g5XPg6AtuTV9WfyXzf73UjdDkvWC6iQJ3VrIGjuHY0kX_gSjJngApb2fSB2mR29ntcOMXx3_ICYQ";

//        JSONObject user = get(s, "123");
        JSONObject jsonObject = userListInfo(s, "1", null);
        System.out.println(jsonObject);

    }
}
