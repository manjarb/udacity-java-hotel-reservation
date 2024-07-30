package model;

public enum RoomType {
    SINGLE,
    DOUBLE,
}

public interface IRoom {
    public String getRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();
}

public class Room implements IRoom {
    String roomNumber;
    Double price;
    RoomType enumeration;

    public String getRoomNumber() {
        return roomNumber;
    }

    public Double getRoomPrice() {
        return price;
    }

    public RoomType getRoomType() {
        return enumeration;
    }

    public boolean isFree() {
        return true;
    }

    @Override
    public String toString() {
        return "Room info: " + enumeration + " " + roomNumber + " " + price;
    }
}
