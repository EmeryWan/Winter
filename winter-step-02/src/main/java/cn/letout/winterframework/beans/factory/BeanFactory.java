package cn.letout.winterframework.beans.factory;

import cn.letout.winterframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
