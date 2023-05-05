package Lesson5;

import java.util.Date;

import Lesson5.models.TableModel;
import Lesson5.presenters.BookingPresenter;
import Lesson5.views.BookingView;

public class Main {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        System.out.println("---------------------------");

        view.reservationTable(new Date(), 1, "Станислав");
        view.changeReservationTable(1001, new Date(), 3, "Станислав");
        System.out.println("---------------------------");

        view.reservationTable(new Date(), 2, "Олег");
        view.changeReservationTable(1003, new Date(), 1, "Олег");
        System.out.println("---------------------------");

        view.reservationTable(new Date(), 2, "Мария");
        System.out.println("---------------------------");

        view.reservationTable(new Date(), 1, "Евгений");
        System.out.println("---------------------------");

    }

}