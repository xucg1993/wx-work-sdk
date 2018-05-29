package work;

import com.alibaba.fastjson.JSONObject;
import config.QyAPIUrl;
import model.User;
import util.http.HttpUtil;

/**
 * 成员管理
 *
 * @author xuchenguang
 * @since 2018.05.29
 */
public class WxWorkMember {


    /**
     * 创建成员
     *
     * @param user
     * @return
     */
    public static JSONObject create(User user) {
        String map = User.getMap(user);
        String post = HttpUtil.post(QyAPIUrl.USER_CREATE_URL + user.getAccessToken(), map);
        return JSONObject.parseObject(post);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserId("123");
        user.setName("测试");
        user.setMobile("17600381103");
        user.setDepartment(new Integer[]{2});
        create(user);
    }
}
