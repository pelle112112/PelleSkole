package TaskFivePelle;


public class Datamatik {
    

    public static void main(String[] args){
        
        Student [] studentArray = new Student[10];

        studentArray[0] = new Student("Kalle", 21, false, 'a', 0);
        studentArray[1] = new Student("Lasse", 24, false, 'a', 1);
        studentArray[2] = new Student("Peter", 22, false, 'a', 2);
        studentArray[3] = new Student("Pelle", 23, false, 'a', 3);
        studentArray[4] = new Student("Louise", 31, true, 'a', 4);
        studentArray[5] = new Student("Laura", 41, true, 'a', 5);
        studentArray[6] = new Student("Mads", 27, false, 'a', 6);
        studentArray[7] = new Student("Kristian", 51, false, 'a', 7);
        studentArray[8] = new Student("Jonas", 28, false, 'a', 8);
        studentArray[9] = new Student("Laila", 21, true, 'a', 9);


        printStudent(studentArray, 7);
        returnIndex(studentArray, "Pelle");


        

    }
    static String printStudent(Student []studentArray, int index){

        String studentName = "";

        for(int i = 0; i < studentArray.length; i++){
            if (studentArray[i].studentID == index){

                studentName = studentArray[i].name;
            }
        }
        System.out.println("Studentname for studentID " + index +  " is: "+ studentName);
        return studentName;
        
    }


    static int returnIndex(Student []studentArray, String studentName){

        int index = 0;

        for(int i = 0; i < studentArray.length; i++){
            if (studentArray[i].name == studentName){

                index = studentArray[i].studentID;
            }
        }
        System.out.println("StudentID for " + studentName +  " is: "+ index);
        return index;
        
    }


}
