package model;

import java.util.Date;

public class Reservation {
    Customer customer;
    IRoom room;
    Date checkInDate;
    Date checkOutDate;

    @Override
    public String toString() {
        return "Reservation info: " + customer + " " + room.toString() + " Checkin " + checkInDate + " Checkout " + checkOutDate;
    }
}
