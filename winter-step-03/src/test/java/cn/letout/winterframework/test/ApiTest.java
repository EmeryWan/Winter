package cn.letout.winterframework.test;

import cn.letout.winterframework.beans.factory.config.BeanDefinition;
import cn.letout.winterframework.beans.factory.BeanFactory;
import cn.letout.winterframework.beans.factory.support.DefaultListableBeanFactory;
import cn.letout.winterframework.test.beans.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化 Bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 获取 单例 Bean
        UserService userServiceSingleton = (UserService) beanFactory.getSingleton("userService");
        userServiceSingleton.queryUserInfo();
    }

}
