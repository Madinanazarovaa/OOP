package Lesson1;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product>products){
        this.products = products;
    }

    public Chocolate getChocolate(String name, String taste){
        for(Product product: products){
            if(product instanceof Chocolate){
                Chocolate choco = ((Chocolate)product);
                if(choco.name.equals(name) && choco.getTaste() == taste)
                return choco;
            }
        }
        return null;
    }
    
}
