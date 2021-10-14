import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;
    static char [] chars;


    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        chars = inputFromFile.toCharArray();
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        printLongestWord();

        printFirstHalfOfEachWord();

        printMostFrequentLetter();

        printLessFrequentLetter();


        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    private static void printLongestWord(){ //Jeg brugte array istedet, da jeg følte det mere overskueligt
        String largestWords = "";
        int longestWordLength = 0, amountOfLargeWords = 0, i=0;
        String longestWordArray [] = {"", "", "", "", "", ""};
        for (String s : text){
            if (s.length() > longestWordLength){
              
                    largestWords = s;
                    longestWordLength = s.length();
                    longestWordArray[0] = s;
                    amountOfLargeWords = 1;
                }

            else if(s.length() == longestWordLength){
                largestWords = largestWords + s + " ";
                amountOfLargeWords++;
                longestWordArray [amountOfLargeWords] = s;
            }
            System.out.println("Word 1: "+longestWordArray[0]);
            if(amountOfLargeWords == 2){

                System.out.println("Word 2: "+longestWordArray[amountOfLargeWords]);
            }
            if(amountOfLargeWords == 3){

                System.out.println("Word 3: "+longestWordArray[amountOfLargeWords]);
            }    
        }
    }

    private static void printFirstHalfOfEachWord(){

        for (String s : text){

            System.out.println(s.substring(0, s.length() / 2));

        }
    }

    private static void printMostFrequentLetter(){
        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z','æ','ø','å'};
        int letterArray[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        char letterSeenMostTimes = 'a';
        String s = " ";

        for (int u = 0; u < chars.length; u++){
            s = s.toLowerCase();

            for(int j = 0; j < 29; j++){

                if (chars[u] == letters[j]){
                    letterArray[j] = letterArray[j] + 1;
                }
            }
        }
        int max = 0;
        for (int counter = 0; counter < letterArray.length; counter++){

            if (letterArray[counter] > max )
            {
                max = letterArray [counter];
                letterSeenMostTimes = letters[counter];
                
            }
        }
        System.out.println("The most seen letter is: '" + letterSeenMostTimes + "', which is seen " + max + " times");
    }


    private static void printLessFrequentLetter(){

        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z','æ','ø','å'};
        int letterArray[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char letterSeenFewestTimes = 'a';
        String s = " ";

        for (int u = 0; u < chars.length; u++){
            s = s.toLowerCase();

            for(int j = 0; j < 29; j++){

                if (chars[u] == letters[j]){
                    letterArray[j] = letterArray[j] + 1;

                }
            }
        }
        int minimum = 1000;
        for (int counter = 0; counter < letterArray.length; counter++){
            
            if (letterArray[counter] < minimum )
            {
                minimum = letterArray [counter];
                letterSeenFewestTimes = letters[counter];
                
            }
        }
        System.out.println("The least seen letter is: '" + letterSeenFewestTimes + "', which is seen " + minimum + " times");
    }
}