package TaskFourPelle;

public class Main {
    
    public static void main(String[] args){

        int intArray[] = {7,5,6};
        int variable = 5, sum = 0, average = 0; 
        String stringArray[] = {"Mercedes", "BMW", "Toyota"};
        boolean booleanArray[] = {true, false, false};


        stringPrint(stringArray);

        sum = sumArray(intArray);
        System.out.println("Sum is: " + sum);

        average = arrayAverage(intArray);
        System.out.println("Average is: " + average);

        int newArray[] = arraySort(intArray); 
        System.out.print("The sorted array is: ");
        for (int i = 0; i < newArray.length; i++){
            System.out.print(" " + newArray[i]);
        }
    }

    static void stringPrint (String [] Array){
        for(int i = 0; i<Array.length; i++){
            System.out.println(Array[i]);
        }
    }

    static int sumArray (int [] Array){
        int sum = 0;
        for(int i = 0; i<Array.length; i++){
            sum = sum + Array[i];   
        }
        return sum;
    }
    static int arrayAverage (int [] Array){
        int sum = sumArray(Array);
        int average = sum / Array.length;
        return average;
    }

    static int[] arraySort (int [] Array){
        for(int i = 0; i<Array.length; i++){
            for(int y = i + 1; y<Array.length; y++){
                int tempValue = 0;
                if(Array[i] > Array[y]){

                    tempValue = Array[i];
                    Array[i] = Array[y];
                    Array[y] = tempValue;

                }
            }
        }
        return Array;
    }
}
