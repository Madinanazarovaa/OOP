package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Chocolate("Шоколад1", 200.0, "Орехи");
        Product product2 = new Chocolate("Шоколад2", 50.0, "");
        Product product3 = new Chocolate("Шоколад3", 150.0, "Малина");
        Product product4 = new Chocolate("Шоколад4", 100.0, "Мармелад");
        Product product5 = new Chocolate("Шоколад5", 125.0, "Печенье");

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
         
        VendingMachine vendingMachine = new VendingMachine(products);

        Chocolate chocolate = vendingMachine.getChocolate("Шоколад1", "");
        if(chocolate != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
        } else{
            System.out.println("Такого шоколада нет");
        }
    }
    
}
