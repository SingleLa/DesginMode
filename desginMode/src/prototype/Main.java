package prototype;

/**
 * 原生模式：
 * 我们在事先生成UnderlinePen  MessageBox 等product的实例  存储在Manager showcase map中
 * 由于product 继承 Cloneable 接口
 * 所以 后续的 p1 p2 p3 我们在这里没有 用new的方式生成 product的实力，而是通过Cloneable接口的clone方法
 */
public class Main {
    public static void main(String[] args){
     //准备
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strongMessage",underlinePen);
        manager.register("warningMessage",mbox);
        manager.register("slashMessage",sbox);

        //生成
        Product p1 = manager.create("strongMessage");
        p1.use("hello,world");
        Product p2 = manager.create("warningMessage");
        p2.use("hello,world");
        Product p3 = manager.create("slashMessage");
        p3.use("hello,world");

    }
}
