package TaskThreePelle;


public class Datamatik {
    

    public static void main(String[] args){
        

        Teacher teacher1 = new Teacher("Margrete", 55, true);   
        Student student1 = new Student("Pelle", 23, false, 'a');
        Student student2 = new Student("Thobias", 22, false, 'a');

        System.out.println("teachers name: " + teacher1.name);
        System.out.println("students name: " + student1.name + ", Students team: " + student1.datamatikerTeam);
        System.out.println("students name: " + student2.name + ", Students team: " + student1.datamatikerTeam);
        

        

    }


}
