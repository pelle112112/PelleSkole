package TaskFivePelle;

public class Student {
    
    String name;
    int age;
    boolean isFemale;
    char datamatikerTeam;
    int studentID;

    public Student(String tmpName,int tmpAge,boolean tmpIsFemale,char tmpDatamatikerTeam, int tmpstudentID){

        studentID = tmpstudentID;
        name = tmpName;
        age = tmpAge;
        isFemale = tmpIsFemale;
        datamatikerTeam = tmpDatamatikerTeam;
    }

}
