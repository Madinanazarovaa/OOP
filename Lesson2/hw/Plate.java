package Lesson2.hw;

public class Plate{
    private int food;
    private int maxCapacity = 100;

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.println("В тарелке: " + food);
    }

    public void FillingThePlate(Cat cat){
        if(food <= cat.getAppetite()){
            food += maxCapacity - food;
            System.out.println("В тарелку добавили корм");
        }
    }
}
