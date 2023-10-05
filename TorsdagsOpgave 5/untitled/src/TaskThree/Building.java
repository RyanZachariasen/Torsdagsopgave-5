package TaskThree;

import java.util.ArrayList;

public class Building {
  ArrayList<Room>rooms = new ArrayList<>();
  private int numberOfBathrooms;
  private int numberOfFloors;
  private boolean isOfficebuilding;

    public Building(ArrayList<Room>roomList, int numberOfBathrooms, int numberOfFloors, boolean isOfficebuilding) {
        this.rooms = roomList;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficebuilding = isOfficebuilding;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setOfficebuilding(boolean officebuilding) {
        isOfficebuilding = officebuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficebuilding() {
        return isOfficebuilding;
    }

}


