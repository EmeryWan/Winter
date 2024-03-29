package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * JDK 实例化 策略
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();

        try {
            if (null == constructor) {
                return clazz.getDeclaredConstructor().newInstance();
            }
            // 有参构造实例化
            return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }

}
