import java.util.ArrayList;

public class Dog {
    public String getName() {
        return name;
    }

    String name;
    boolean isHungry;
    public Owner ejer;
    public ArrayList<Dog> offSpring = new ArrayList<>();


    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public String feedDog(){
        if (isHungry == true){
            isHungry = false;
            System.out.println(name + " has been fed");
        }
        String fodret ="Hunden er fodret";
        return fodret;
    }

    public ArrayList<Dog> setOffSpring(Dog dog){

        offSpring.add(dog);
        //System.out.println("arraylist: " + offSpring);
        return offSpring;
    }

    public ArrayList<Dog> getOffSpring(){
        return offSpring;

    }

    public String getOwnerName() {
        return ejer.name;
    }

    public void setOwnerName(String name) {
        this.ejer.name = name;
    }

    public void setOwner(Owner ejer) {
        this.ejer = ejer;
    }

    public String toString(){
        return this.getName();
    }
}
