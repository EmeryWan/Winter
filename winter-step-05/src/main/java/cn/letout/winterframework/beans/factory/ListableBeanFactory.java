package cn.letout.winterframework.beans.factory;

import cn.letout.winterframework.beans.BeansException;

import java.util.Map;

/**
 * 扩展 BeanFactory 接口
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的 Bean 名称
     */
    String[] getBeanDefinitionNames();

}
