package cn.letout.winterframework.test.beans;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("10001", "一号");
        map.put("10002", "二号");
        map.put("10003", "三号");
    }

    public String queryUserName(String uId) {
        return map.get(uId);
    }

}
