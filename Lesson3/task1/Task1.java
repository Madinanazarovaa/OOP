package Lesson3.task1;

public class Task1 {
    

    public static void main(String[] args) {

        int[] arr = new int[] {12, 3, 5, 6, -6, 3};
        ArrayUtils.printArray(arr);


        Animal[] animals = {
                new Cat("Барсик", 20, 30),
                new Dog("Шарик", 50, 100),
                new Cat("Персик", 50, 0),
                new Animal("Рога и копыта", 50, 50),
                new Animal("Четыре лапы и хвост", 30, 30)
        };

        for (Animal animal: animals) {
            animal.run(20);
            animal.swim(40);
            animal.run(10);
            animal.swim(50);
            animal.run(30);
            animal.swim(70);

        }


        System.out.printf("Кол-во котов: %d\n", Cat.getCounter());
        System.out.printf("Кол-во собак: %d\n", Dog.getCounter());
        System.out.printf("Кол-во животных: %d\n", Animal.getCounter());





    }
}

class Animal{

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    public Animal() {
    }

    public void run(int distance){
        if (distance <= maxRun){
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distance){
        if (distance <= maxSwim){
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }
}

class Cat extends Animal{

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }


    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать.", name);
    }
}

class Dog extends Animal{

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    
}
