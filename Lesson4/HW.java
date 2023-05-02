package Lesson4;

/**
 Домашняя работа, задача:
 ========================

 a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.
 */

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {
        Box<Orange> oranges = new Box<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        System.out.printf("Общий вес коробки с апельсинами: %s\n", oranges.getWeight());

        Box<Apple> apples = new Box<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        System.out.printf("Общий вес коробки с яблоками: %s\n", apples.getWeight());

        Box<Orange> oranges2 = new Box<>();
        oranges2.add(new Orange());
        oranges2.add(new Orange());
        oranges2.add(new Orange());

        System.out.printf("Общий вес коробки с апельсинами: %s\n", oranges2.getWeight());

        System.out.println("---------------------------------------------");

        oranges.compare(apples);

        System.out.println("---------------------------------------------");

        oranges2.transfer(oranges);
    }

}

abstract class Fruit{

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit>{

    ArrayList<T> fruits = new ArrayList<>();

    public Double getWeight(){
        double weights = 0.0;
        for (Fruit fruit : fruits) {
            weights += fruit.getWeight();
        }
        return weights;
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> compareBox) {
        if (Math.abs(compareBox.getWeight() - this.getWeight()) < 0.0001) {
            System.out.println("Вес коробок одинаковый");
            return true;
        } else {
            System.out.println("Вес коробок разный");
            return false;
        }
    }

    public void transfer (Box<T> other) {
        other.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.printf("Фрукты пересыпали ");
        System.out.println();
        System.out.printf("Общий вес в коробке: %s\n", other.getWeight());
    }

        
}
