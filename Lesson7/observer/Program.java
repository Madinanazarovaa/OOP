package Lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        Master ivanov = new Master("Ivanov", VacancyType.PROGRAMMER);
        Master petrov = new Master("Petrov", VacancyType.PROGRAMMER);
        Student sidorov = new Student("Sidorov", VacancyType.COURIER);
        Manager frolov = new Manager("Frolov", VacancyType.SALES_MANAGER);
        Manager lewandowski = new Manager("Lewandowski", VacancyType.SALES_MANAGER);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(frolov);
        jobAgency.registerObserver(lewandowski);

        yandex.sendVacancy("Курьер", 50000, VacancyType.COURIER);
        System.out.println();
        geekBrains.sendVacancy("Менеджер по продажам", 120000, VacancyType.SALES_MANAGER);
        System.out.println();
        google.sendVacancy("IT специалист", 150000, VacancyType.PROGRAMMER);
        System.out.println();

        // for(int i = 0; i < 10; i++){
        //     geekBrains.needEmployee();
        //     google.needEmployee();
        //     yandex.needEmployee();
        // }

    }

}
