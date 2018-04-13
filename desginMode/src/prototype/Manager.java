package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式
 * 使用Product接口复制实例
 * showCase 是hashmap类型 保存key与实例间的对应关系
 *register 方法将key与product接口注册到showcase Map 中
 */
public class Manager {
    private Map showcase = new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
