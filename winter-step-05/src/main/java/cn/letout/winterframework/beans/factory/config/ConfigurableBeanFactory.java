package cn.letout.winterframework.beans.factory.config;

import cn.letout.winterframework.beans.factory.HierarchicalBeanFactory;

/**
 * 一个可获取 BeanPostProcessor、BeanClassLoader 等方法的配置化接口
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
