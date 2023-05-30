package Lesson7.observer;

public class Master implements Observer {

    private String name;
    private double salary;
    VacancyType vacancyType;

    public Master(String name, VacancyType vacancyType){
        this.name = name;
        salary = 120000;
        this.vacancyType = vacancyType;

    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (this.salary <= salary && this.vacancyType == vacancyType){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %f]\n",
                    name, nameCompany, salary);
        }
    }
}
