public class Dieselbil extends Bil{
    boolean harPartikelFilter;
    double kmPrl;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean tmpharPartikelFilter, int tmpkmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = tmpharPartikelFilter;
        this.kmPrl = tmpkmPrl;

    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelFilter=" + harPartikelFilter +
                ", kmPrl=" + kmPrl +
                '}';
    }


    public double beregnGrønAfgift() {
        double grønAfgift = 0;



        if(kmPrl >= 20 && kmPrl <= 50){
            grønAfgift = 130;
        }
        if(kmPrl >= 15 && kmPrl < 20){
            grønAfgift = 1390;
        }
        if(kmPrl >= 10 && kmPrl < 15){
            grønAfgift = 1850;
        }
        if(kmPrl >= 5 && kmPrl < 10){
            grønAfgift = 2770;
        }
        if(kmPrl >= 0 && kmPrl < 5){
            grønAfgift = 15260;
        }
        if (harPartikelFilter == false){
            grønAfgift = grønAfgift + 1000;
        }


        return grønAfgift;
    }


}
