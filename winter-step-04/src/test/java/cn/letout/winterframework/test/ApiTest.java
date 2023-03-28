package cn.letout.winterframework.test;

import cn.letout.winterframework.beans.factory.config.BeanDefinition;
import cn.letout.winterframework.beans.factory.BeanFactory;
import cn.letout.winterframework.beans.factory.support.DefaultListableBeanFactory;
import cn.letout.winterframework.test.beans.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化 Bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService", "Emery");
        System.out.println(userService);
        userService.queryUserInfo();
        // 获取 单例 Bean
        // UserService userServiceSingleton = (UserService) beanFactory.getSingleton("userService");
        // userServiceSingleton.queryUserInfo();
    }

    @Test
    public void testCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });

        Object object = enhancer.create(new Class[]{String.class}, new Object[]{"Emery"});
        System.out.println(object);
    }

    @Test
    public void testNewInstance() throws InstantiationException, IllegalAccessException {
        Class<?> clazz = UserService.class;
        UserService userService = (UserService) clazz.newInstance();
        System.out.println(userService);
    }

    @Test
    public void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<UserService> clazz = UserService.class;
        Constructor<UserService> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("Emery");
        System.out.println(userService);
    }

    @Test
    public void testParameterTypes() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<UserService> clazz = UserService.class;
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        Constructor<?> constructor = null;
        for (Constructor<?> c : declaredConstructors) {
            if (c.getParameterTypes().length == 1) {
                constructor = c;
                break;
            }
        }

        assert constructor != null;
        Constructor<UserService> declaredConstructor = clazz.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("Emery");
        System.out.println(userService);
    }

}
