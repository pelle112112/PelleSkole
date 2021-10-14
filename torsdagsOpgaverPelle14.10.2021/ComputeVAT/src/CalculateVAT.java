public class CalculateVAT {
    public static double doVAT(double number){
        final int PRCVAT = 25;
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
