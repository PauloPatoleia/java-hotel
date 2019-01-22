package org.academiadecodigo.bootcamp22.javahotel;

public class Hotel {

    private Room[] rooms;

    public Hotel(int numberOfRooms) {

        this.rooms = new Room[numberOfRooms];

        for (int i = 0; i < numberOfRooms; i++) {
            this.rooms[i] = new Room();
        }
    }

    public void checkIn(Guest guest) {

        Room freeRoom = this.findRoom(null);

        if(this.isGuestAlreadyInTheHotel(guest)) {
            System.out.println("You are already booked in our hotel sir.");
            return;
        }

        if(freeRoom == null) {
            System.out.println("No rooms available at the moment.");
            return;
        }

        freeRoom.setOcupant(guest);

    }

    public void checkOut(Guest guest) {

        Room guestRoom = this.findRoom(guest);

        if(guestRoom == null) {
            System.out.println("We do not have you associated with any room");
            return;
        }

        guestRoom.setOcupant(null);

    }

    private Room findRoom(Guest guest) {

        Room room = null;

        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].getOcupant() == guest) {
                room = rooms[i];
            }
        }
        return room;
    }


    private boolean isGuestAlreadyInTheHotel(Guest guest) {

        if(this.findRoom(guest) == null) {
            return false;
        }

        return true;

    }
}
