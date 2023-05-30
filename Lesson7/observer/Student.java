package Lesson7.observer;

public class Student implements Observer {

    private String name;
    private double salary;
    VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        salary = 5000;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (this.salary <= salary && this.vacancyType == vacancyType){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n",
                    name, nameCompany, salary);
        }
    }
}
