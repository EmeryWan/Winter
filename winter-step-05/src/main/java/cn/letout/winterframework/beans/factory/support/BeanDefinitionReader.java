package cn.letout.winterframework.beans.factory.support;

import cn.letout.winterframework.beans.BeansException;
import cn.letout.winterframework.core.io.Resource;
import cn.letout.winterframework.core.io.ResourceLoader;

/**
 * 读取 Bean 定义相关信息的接口
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    //

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
