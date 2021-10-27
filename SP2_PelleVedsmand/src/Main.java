public class Main {

    public static void main(String[] args) {
        Garage g1 = new Garage();

        Bil MercedesAMG = new Benzinbil(2034,"Mercedes", "AMG", 2014, 4, 95, 18);
        Bil BMW300D = new Dieselbil(2851, "BMW", "330D", 2008, 4, true, 28);
        Bil TeslaP90 = new Elbil(2984, "Tesla", "P90", 2020, 2, 85, 652, 300);

        g1.tilføjBilTilGarage(MercedesAMG);
        g1.tilføjBilTilGarage(BMW300D);
        g1.tilføjBilTilGarage(TeslaP90);
        System.out.println("Bilerne i garagen: \r\n" + g1);
        g1.udregnGrønAfgift();

    }
}
