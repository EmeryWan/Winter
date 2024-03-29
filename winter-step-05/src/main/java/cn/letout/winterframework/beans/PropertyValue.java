package cn.letout.winterframework.beans;

/**
 * 封装一个 Bean 中的一个的属性信息
 */
public class PropertyValue {

    /**
     * 属性名
     */
    private final String name;

    /**
     * 属性值
     */
    private final Object value;


    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
