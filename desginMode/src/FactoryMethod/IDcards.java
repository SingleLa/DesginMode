package FactoryMethod;

public class IDcards extends Product {
    private String owner;
    IDcards(String owner){
        System.out.println("制作IDcard"+owner);
        this.owner = owner;
    }
    @Override
    public void user() {
        System.out.println("正在使用IDcard"+owner);
    }

    public String getOwner() {
         return  owner;
    }
}
