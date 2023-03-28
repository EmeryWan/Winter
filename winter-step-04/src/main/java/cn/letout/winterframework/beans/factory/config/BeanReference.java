package cn.letout.winterframework.beans.factory.config;

/**
 * Bean 引用
 *
 * 用于创建 Bean 对象时，需要注入对象类型的属性
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
