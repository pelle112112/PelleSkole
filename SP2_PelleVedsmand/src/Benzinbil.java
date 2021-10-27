public class Benzinbil extends Bil{
    int oktantal;
    double kmPrl;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int tmpoktantal, int tmpkmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = tmpoktantal;
        this.kmPrl = tmpkmPrl;
    }


    public int getOktantal() {
        return oktantal;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrl=" + kmPrl +
                ", regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }


    public double beregnGrønAfgift() {
        double grønAfgift = 0;

        if(kmPrl >= 20 && kmPrl <= 50){
            grønAfgift = 330;
        }
        else if(kmPrl >= 15 && kmPrl < 20){
            grønAfgift = 1050;
        }
        else if(kmPrl >= 10 && kmPrl < 15){
            grønAfgift = 2340;
        }
        else if(kmPrl >= 5 && kmPrl < 10){
            grønAfgift = 5500;
        }
        else if(kmPrl >= 0 && kmPrl < 5){
            grønAfgift = 10470;
        }
        return grønAfgift;
    }
}
