package Lesson5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Lesson5.presenters.Model;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return столики
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        if (!isTableFree(tableNo)) {
            System.out.println("Столик занят");
            return -1;
        }
                for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Невозможно забронировать столик.");
    }

    //TODO: Разработать самостоятельно в рамках домашней работы
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        if (!isTableFree(tableNo)) {
            System.out.println("Столик занят");
            return -1;
        }
        for (Table table : tables){
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    cancelReservation(oldReservation);
                    Reservation newReservation = new Reservation(reservationDate, name);
                    table.getReservations().add(newReservation);
                    return newReservation.getId();
                }
            }
        }
        return -1;
    }

    public boolean cancelReservation(int reservationId) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationId) {
                    table.getReservations().remove(reservation);
                    System.out.println("Бронь #" + reservationId + " удалена");
                    return true;
                }
            }
        }
        System.out.println("Бронь #" + reservationId + " не найдена");
        return false;
    }


    public boolean isTableFree(int tableNo) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                if (table.getReservations().isEmpty()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


}
