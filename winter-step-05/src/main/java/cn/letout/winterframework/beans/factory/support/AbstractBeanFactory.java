package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.BeanFactory;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

/**
 * 抽象模板
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        // 获取单例 Bean
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        // 实例化 Bean
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
