package cn.letout.winterframework.test.beans;

// Bean
public class UserService {

    private UserDao userDao;

    private String uId;

    public void queryUserInfo() {
        System.out.println("查询用户信息");
        System.out.println(userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
