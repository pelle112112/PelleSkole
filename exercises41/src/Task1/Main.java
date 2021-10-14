package Task1;

public class Main {

    Driver driver;
    Car car;

    public static void main (String [] args){
        Driver Pelle = new Driver("Pelle", 23);
        Car car1 = new Car("BMW", "M5", 2018, "Sedan");
        Car car2 = new Car("Mercedes", "AMG", 2021, "Cabriolet");

        car1.DriverSetter(Pelle.Name);
        car2.DriverSetter(Pelle.Name);

        System.out.println(car1);
        System.out.println(Pelle);

        System.out.println(car2);
        System.out.println(Pelle);
    }
}
