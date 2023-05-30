package Lesson7.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;

    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000);
        jobAgency.sendOffer(nameCompany, salary, null);
    }

    public void sendVacancy(String position, double salary, VacancyType vacancyType){
        Vacancy vacancy = new Vacancy(position, salary, vacancyType);
        jobAgency.sendOffer(vacancy.getPosition(), vacancy.getSalary(), vacancy.getType());
        System.out.printf("Новая вакансия: %s - %.2f (%s)%n", position, salary, vacancy.getType());
    }

}
