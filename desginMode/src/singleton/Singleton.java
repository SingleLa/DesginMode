package singleton;

public class Singleton {
    private volatile static Singleton singleton = null;
    private Singleton(){
        System.out.println("这是一个单利模式");
    }
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
