package Task2;
import java.util.ArrayList;

public class Main {

    public static void main(String [] args){
        ArrayList<Room> rooms= new ArrayList<Room>();

        Room r1 = new Room(4,2,3,2);
        Room r2 = new Room(6,3,4,4);
        Room r3 = new Room(10,6,12,8);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Building b1 = new Building(r1,3,2,false);
        b1.getRooms();





    }
}
