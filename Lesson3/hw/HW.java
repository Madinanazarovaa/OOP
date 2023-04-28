package Lesson3.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами 
// Comparator, Comparable.

// Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
// Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). 
// Метод должен быть один!
// Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне 
// ваших классов).
// Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

public class HW {
    private static Random random = new Random();

    /**
     * TODO: 2. Переработать метод generateEmployee(). Метод должен возвращать
     * любого случайного сотрудника разного типа (Worker, Freelancer)
     * @return
     */
    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);
        int age = random.nextInt(18, 50);
        
        if (random.nextInt(2) == 0){
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)],salary * salaryIndex, age);
        } else{
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)],salary, age);
        }

    }

    public static void main(String[] args) {

        //Worker worker = new Worker("Глеб", "Григорьев", 120000);
        //System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        System.out.println("\n*** Неотсортированный массив сотрудников ***\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        // Сортировка по фамилии
        // Arrays.sort(employees, new SurNameComparator());

        // Сортировка по возрасту
        Arrays.sort(employees, new AgeComparator());

        // Сортировка по ЗП
        Arrays.sort(employees);

        System.out.println("\n*** Отсортированный массив сотрудников ***\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        /*int a = 2;
        boolean f = true;
        String str = "Hello!";
        System.out.println(worker);
        System.out.println(a);
        System.out.println(f);
        System.out.println(str);*/

    }

}

class SalaryComparator implements Comparator<Employee>{

    // 1 0 -1
    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 :
        //        (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
    }
}

class SurNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.surName.compareTo(o2.surName);
    }

}

class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
    }

}

abstract class Employee implements Comparable<Employee>{

    protected String firstName;
    protected String surName;
    protected double salary;
    protected Integer age;

    public Employee(String firstName, String surName, double salary, Integer age) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f; Возраст: %f",
                surName, firstName, salary, calculateSalary(), age);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}

class Worker extends Employee{

    public Worker(String firstName, String surName, double salary, Integer age) {
        super(firstName, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %d; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
}

/**
 * TODO: 1. Разработать самостоятельно в рамках домашней работы.
 */
class Freelancer extends Employee{
    public Freelancer(String firstName, String surName, double salary, Integer age) {
        super(firstName, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
    // salary * 18 * 5
}