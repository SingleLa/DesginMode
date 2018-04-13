package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDcardFactory extends Factory {
    List owners = new ArrayList();
    @Override
    public Product createProduct(String owner) {
        return new IDcards(owner);
    }

    @Override
    public void registerProduct(Product product) {
        IDcards iDcards = (IDcards)product;
        owners.add(iDcards.getOwner());
    }
}
