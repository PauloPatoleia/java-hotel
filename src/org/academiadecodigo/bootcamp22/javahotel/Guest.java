package org.academiadecodigo.bootcamp22.javahotel;

public class Guest {

    private String name;

    public Guest(String name) {
        this.name = name;
    }


    public void checkIn(Hotel hotel) {

        hotel.checkIn(this);

    }

    public void checkOut(Hotel hotel) {

        hotel.checkOut(this);

    }
}
