package cn.letout.winterframework.test;

import cn.letout.winterframework.BeanDefinition;
import cn.letout.winterframework.BeanFactory;
import cn.letout.winterframework.test.beans.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化 Bean
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注入 Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
