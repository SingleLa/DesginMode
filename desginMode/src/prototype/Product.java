package prototype;

/**
 * 复制功能的接口
 * use方法用于“使用”的方法，具体怎么“使用”,则被交予子类去实现
 * createClone方法是用于复制实例的方法
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
