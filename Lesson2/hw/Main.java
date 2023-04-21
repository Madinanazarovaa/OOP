package Lesson2.hw;

// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).

// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. 
// Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт 
// (это сделано для упрощения логики программы).

// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
        new Cat("Барсик", 15, false),
        new Cat("Рыжик", 50, false),
        new Cat("Пупсик", 80, false),
        };

        Plate plate = new Plate(100);
        
        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            if(plate.getFood() >= cat.getAppetite()){
            plate.setFood(plate.getFood() - cat.getAppetite());
        } else{ 
            plate.FillingThePlate(cat);
            plate.info();
            cat.eat(plate);
            plate.setFood(plate.getFood() - cat.getAppetite());
        }

        }
    }
}
