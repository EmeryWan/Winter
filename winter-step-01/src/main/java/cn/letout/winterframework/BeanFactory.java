package cn.letout.winterframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean 对象工厂，存放 Bean 定义，通过 Map 获取 Bean
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
