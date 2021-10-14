public class Controller {
    public static void runController(View view, CalculateVAT calc, Dialog dialog) {
        final String MSG = "MOMS";
        double userIn = dialog.doDiag();
        double moms = calc.doVAT(userIn);
        view.doView(moms,MSG);
    }
}
