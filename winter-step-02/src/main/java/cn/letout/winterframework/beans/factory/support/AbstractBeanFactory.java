package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.BeanFactory;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

/**
 * 抽象 Bean 工厂基类
 * 抽象模板
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        // 获取单例 Bean
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        // 实例化 Bean
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
