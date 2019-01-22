package org.academiadecodigo.bootcamp22.javahotel;

public class Room {

    private Guest ocupant = null;


    public void setOcupant(Guest ocupant) {
        this.ocupant = ocupant;
    }

    public Guest getOcupant() {
        return ocupant;
    }
}
