package cn.letout.winterframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Resource --> ClassPathResource / FileSystemResource / UrlResource
 * 资源处理器接口
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
