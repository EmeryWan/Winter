package cn.letout.winterframework.test.beans;

// Bean
public class UserService {

    private String name;

    public UserService() {
        this.name = "default";
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息");
    }

    @Override
    public String toString() {
        return name;
    }
}
