public class View {
    public static void doView(double result, String typeOfResult){
        final String MSG = "MOMS";
        final String CURRENCY = "Kr";
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
