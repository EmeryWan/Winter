package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinitionRegistry -> DefaultListableBeanFactory
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();

}
