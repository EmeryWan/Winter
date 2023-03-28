package cn.letout.winterframework.test;

import cn.letout.winterframework.beans.PropertyValue;
import cn.letout.winterframework.beans.PropertyValues;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;
import cn.letout.winterframework.beans.factory.config.BeanReference;
import cn.letout.winterframework.beans.factory.support.DefaultListableBeanFactory;
import cn.letout.winterframework.test.beans.UserDao;
import cn.letout.winterframework.test.beans.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化 Bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean
        // 2.1
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 2.2
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
