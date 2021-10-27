import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Garage  extends ArrayList{
    private static final long serialVersionUID = 1L;
    ArrayList<Bil> arrayList = new ArrayList<Bil>();
    String garageNavn;


    void tilføjBilTilGarage(Bil bil){
        arrayList.add(bil);
    }
    void udregnGrønAfgift(){
        double samletAfgift = 0;
        for(Bil bil: arrayList){
            samletAfgift = (samletAfgift + bil.beregnGrønAfgift());
        }
        System.out.println("Den samlede afgift er lig med: " + samletAfgift + " kr");
    }

    @Override
    public String toString() {
        String resultat = "";
        for(Bil bil: arrayList){
            resultat += bil.toString();
            resultat += "\r\n";
        }
        return resultat;
    }
}
