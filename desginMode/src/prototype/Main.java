package prototype;

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
