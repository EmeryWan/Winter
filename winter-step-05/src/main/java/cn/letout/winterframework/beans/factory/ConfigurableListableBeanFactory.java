package cn.letout.winterframework.beans.factory;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;
import cn.letout.winterframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 提供分析和修改 Bean 对象，预先实例化的接口
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
