package Lesson1;

public class Product {
    protected String name;
    protected Double price;

    public Double getPrice(){
        return price;
    }
    // mutator
    public void setPrice(Double price){
        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара");

    }

    //accessor
    public String getName(String name){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public Product(){
        this("Продукт");


    }

    public Product(String name){
        this(name, 1.0);

    }

    public Product(String name, Double price){
        if (name.length() < 3){
            this.name = "Неизвестно";
        } else{
            this.name = name;
        }
        if (price <= 0.0)
            throw new RuntimeException("Некорректная сумма товара");
        this.price = price;
        }

    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    
    String displayInfo(){
        return String.format("%s, %f", name, price);
    }
}
