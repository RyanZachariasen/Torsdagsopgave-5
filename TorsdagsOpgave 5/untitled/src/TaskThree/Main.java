package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//3.g In your main method, instantiate at least three different rooms.
        Room room1 = new Room(2, 7, 1);
        Room room2 = new Room(1, 1, 0);
        Room room3 = new Room(1, 0, 0);

//3.h Add the three rooms to a collection
// (preferably of the same data type used for the "rooms" field in your Building.java class).
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building = new Building(roomList, 50, 1, false);

        int sumLamps = countLampsInBuilding(building);
        System.out.println("The number of lamps is : " + sumLamps);

        isNormal(building);
    }

    static int countLampsInBuilding(Building building) {
        ArrayList<Room> rooms = building.getRooms();
        int sumLamps = 0;
        for (Room room : rooms) {
            sumLamps += room.getNumberOfLamps();
        }
        return sumLamps;

    }

    static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        if (numberOfFloors > numberOfRooms) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
