package cn.letout.winterframework.core.io;

/**
 * 资源加载器
 */
public interface ResourceLoader {

    /**
     * 用类路径加载的前缀
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
