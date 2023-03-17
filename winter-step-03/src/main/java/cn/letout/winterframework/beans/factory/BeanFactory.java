package cn.letout.winterframework.beans.factory;

import cn.letout.winterframework.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
