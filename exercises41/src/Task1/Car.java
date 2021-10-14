package Task1;

public class Car {

    String Make;
    String Model;
    int Year;
    String BodyStyle;
    String Driver;


    public Car (String tempMake, String tempModel, int tempYear, String tempBodystyle){
        Make = tempMake;
        Model = tempModel;
        Year = tempYear;
        BodyStyle = tempBodystyle;
    }

    public void DriverSetter(String tempDriver){
        Driver = tempDriver;
    }
    public String DriverGetter(){
        return this.Driver;
    }
    public String toString(){
        return "Make: "+Make+". Model: "+Model+ " ("+ Year + "), BodyStyle: "+BodyStyle;
    }
}



