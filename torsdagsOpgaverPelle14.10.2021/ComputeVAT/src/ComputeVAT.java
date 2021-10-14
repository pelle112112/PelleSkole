import java.util.Scanner;
public class ComputeVAT {
    static Dialog dialog = new Dialog();
    static CalculateVAT calc = new CalculateVAT();
    static View view = new View();

    final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";

    public static void main(String[] args){
        Controller controller = new Controller();
        controller.runController(view, calc, dialog);
    }





}