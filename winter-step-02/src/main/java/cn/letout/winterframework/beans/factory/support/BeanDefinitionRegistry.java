package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinitionRegistry -> DefaultListableBeanFactory
 *
 * Bean 定义注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
