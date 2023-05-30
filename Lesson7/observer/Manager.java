package Lesson7.observer;

public class Manager implements Observer{

    private String name;
    private double salary;
    private VacancyType vacancyType;

    public Manager(String name, VacancyType vacancyType){
        this.name = name;
        salary = 100000;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (this.salary <= salary && this.vacancyType == vacancyType){
            System.out.printf("Менеджер %s >>> Мне нужна эта работа! [%s - %f]\n", name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Менеджер %s >>> Я найду работу получше! [%s - %f]\n",
                    name, nameCompany, salary);
        }
        
    }


    
}
