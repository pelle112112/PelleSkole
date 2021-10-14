package Task2;

public class Building {
    Room rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;


    public Building(Room tmpRooms, int tmpNumberOfBathrooms, int tmpNumberOfFloors, boolean tmpIsOfficeBuilding){
        rooms = tmpRooms;
        numberOfBathrooms = tmpNumberOfBathrooms;
        numberOfFloors = tmpNumberOfFloors;
        isOfficeBuilding = tmpIsOfficeBuilding;
    }
    public Room getRooms(){
        return this.rooms;
    }
    public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
    }
    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }
    public boolean getisOfficeBuilding(){
        return this.isOfficeBuilding;
    }




}
