package cn.letout.winterframework.beans.factory.config;

/**
 * 单例 Bean 注册接口，注册和获取单例对象
 * SingletonBeanRegistry -> DefaultSingletonBeanRegistry
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
