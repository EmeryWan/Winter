package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.BeansException;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

/**
 * BeanFactory <- AbstractBeanFactory <- AbstractAutowireCapableBeanFactory
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
