public class Elbil extends Bil{

    int batterikapacitetKWh;
    int maxKm;
    double whPrKm;


    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int tmpbatterikapacitetKWh, int tmpmaxKm, double tmpwhPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = tmpbatterikapacitetKWh;
        this.maxKm = tmpmaxKm;
        this.whPrKm = tmpwhPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }


    public double beregnGrønAfgift() {
        double grønAfgift = 0;

        double kmPrl = 100/(whPrKm/91.25);

        if(kmPrl >= 20 && kmPrl <= 50){
            grønAfgift = 330;
        }
        if(kmPrl >= 15 && kmPrl < 20){
            grønAfgift = 1050;
        }
        if(kmPrl >= 10 && kmPrl < 15){
            grønAfgift = 2340;
        }
        if(kmPrl >= 5 && kmPrl < 10){
            grønAfgift = 5500;
        }
        if(kmPrl >= 0 && kmPrl < 5){
            grønAfgift = 10470;
        }

        return grønAfgift;
    }
}
