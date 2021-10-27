public class Main {

    public static void main(String[] args) {
        Garage g1 = new Garage();

        Bil benzinBil = new Benzinbil(2034,"Mercedes", "AMG", 2014, 4, 95, 18);
        Bil dieselBil = new Dieselbil(2851, "BMW", "330D", 2008, 4, true, 28);
        Bil elbil = new Elbil(2984, "Tesla", "P90", 2020, 2, 85, 652, 300);

        g1.tilføjBilTilGarage(benzinBil);
        g1.tilføjBilTilGarage(dieselBil);
        g1.tilføjBilTilGarage(elbil);
        System.out.println(g1);
        g1.udregnGrønAfgift();

    }
}
