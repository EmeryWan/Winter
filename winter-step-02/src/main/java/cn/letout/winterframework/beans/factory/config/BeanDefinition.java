package cn.letout.winterframework.beans.factory.config;

/**
 * Bean 的定义（Class）
 * Bean 的实例化操作由容器处理，所以注册 Bean 信息时，只需要注册类信息 Class
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
