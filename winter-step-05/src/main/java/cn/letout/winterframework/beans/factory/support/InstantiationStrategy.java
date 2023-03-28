package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    /**
     * @param constructor 利用反射获取符合入参信息相对应的构造函数
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;

}
