package cn.letout.winterframework.test;

import cn.hutool.core.io.IoUtil;
import cn.letout.winterframework.beans.PropertyValue;
import cn.letout.winterframework.beans.PropertyValues;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;
import cn.letout.winterframework.beans.factory.config.BeanReference;
import cn.letout.winterframework.beans.factory.support.DefaultListableBeanFactory;
import cn.letout.winterframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.letout.winterframework.core.io.DefaultResourceLoader;
import cn.letout.winterframework.core.io.Resource;
import cn.letout.winterframework.test.beans.UserDao;
import cn.letout.winterframework.test.beans.UserService;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.io.InputStream;

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


    //


    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void testClasspath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testFile() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testURL() throws IOException {}

    @Test
    public void testXml() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }

}
