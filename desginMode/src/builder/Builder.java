package builder;

/**
 * maketile makestring makeitem close 分别是编写 标题 字符串 条目  完成文档编写的方法
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String string);
    public abstract void makeItem(String[] item);
    public abstract void close();
}
