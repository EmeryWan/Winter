package cn.letout.winterframework.beans.factory.config;

import cn.letout.winterframework.beans.PropertyValues;

/**
 * Bean 的定义（Class）
 * Bean 的实例化操作由容器处理，所以注册 Bean 信息时，只需要注册类信息 Class
 */
public class BeanDefinition {

    /**
     * Bean 类型
     */
    private Class beanClass;

    /**
     * Bean 属性相关信息
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }


    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
