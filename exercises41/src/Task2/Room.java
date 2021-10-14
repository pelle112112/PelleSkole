package Task2;

public class Room {

    int walls;
    int numberOfDoors;
    int numberOfLamps;
    int numberOfWindows;


    public Room(int tmpWalls, int tmpnumberOfDoors, int tmpnumberOfLamps, int tmpNumberOfWindows){
        walls = tmpWalls;
        numberOfDoors = tmpnumberOfDoors;
        numberOfLamps = tmpnumberOfLamps;
        numberOfWindows = tmpNumberOfWindows;
    }

    public int wallsGetter(){
        return this.walls;
    }
    public int getNumberOfDoorsGetter(){
        return this.numberOfDoors;
    }
    public int getNumberOfLampsGetter(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindowsGetter(){
        return this.numberOfWindows;
    }



}
