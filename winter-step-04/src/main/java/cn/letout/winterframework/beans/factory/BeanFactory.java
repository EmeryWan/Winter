package cn.letout.winterframework.beans.factory;

import cn.letout.winterframework.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
