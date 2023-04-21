package Lesson2.hw;

public class Cat{
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean getSatiety(Plate plate) {
        if(plate.getFood() >= appetite){
            return true;
        } else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    
    public void eat(Plate plate){
        if(plate.getFood() >= appetite){
            System.out.println(name + " поел " + getSatiety(plate));
        } else{
            System.out.println("Корм закончился");
        }
    }
}
