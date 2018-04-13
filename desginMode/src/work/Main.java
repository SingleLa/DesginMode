package work;

public class Main {
    public static void main(String[] args){
        Factory factory = new IDcardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        card1.user();
        card2.user();
    }
}
