package TaskTwobcdPelle;

class Main{
    int int1, int2, sum;

    public static void main(String[] args){

        Main integers = new Main();
        String string1 = "mercedes";
        String string2 = " ";
        boolean stringchecker;
        integers.int1 = 5;
        integers.int2 = 10;

        integers.sum = sumOfInts(integers.int1,integers.int2);
        string2 = stringChangerToUpper(string1);
        stringchecker = checkFirstChar(string1);

        System.out.println("Sum is "+ integers.sum);
        System.out.println("new string is "+ string2);

        if(stringchecker == true){
            System.out.println("First char is Uppercase");
        }
        else{
            System.out.println("First char is Lowercase");
        }


    }

    static int sumOfInts(int int1, int int2){

        int sum = int1 + int2;
        return sum;
    }

    static String stringChangerToUpper (String stringInput){
        
        String stringOutput = stringInput.toUpperCase();
        return stringOutput;
    }
    static Boolean checkFirstChar (String stringInput){

        if (Character.isUpperCase(stringInput.charAt(0)) == true){
            return true;
        }
        else{
            return false;
        }

    }

}
