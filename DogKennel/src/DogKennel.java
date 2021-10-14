import java.util.ArrayList;
import java.util.Arrays;


public class DogKennel {

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog newDog = new Dog("Luffa",true);
        Dog newDog2 = new Dog("Ronja",true);
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        Owner Henning = new Owner();
        myDog.setOwner(Henning);
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring(newDog);

        // print alle hvalpe
        ArrayList<Dog> myOff = myDog.setOffSpring(newDog2);
        for (Dog str: myOff) {
            System.out.println("Offspring: " + myDog.getOffSpring());
        }

        myDog.setOwnerName("Poul");
        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwnerName());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);

    }
}
