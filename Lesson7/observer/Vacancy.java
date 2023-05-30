package Lesson7.observer;

public class Vacancy{
    
    private String position;
    private double salary;
    private VacancyType type;

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Vacancy(String position, double salary, VacancyType type) {
        this.position = position;
        this.salary = salary;
        this.type = type;
    }

    public VacancyType getType() {
        return type;
    }
}
