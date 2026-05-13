import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Chantier {
    private boolean termine;
    private ArrayList<Ouvrier> ouvriers;
    private Batiment batiment;

    Chantier(Batiment batiment){
        this.batiment = batiment;
        this.ouvriers = new ArrayList<Ouvrier>();
    }

    @Override
    public String toString(){
        String reponse = String.format("%s\nOuvrier(s) sur place : ",batiment);
        for(Ouvrier ouvrier : ouvriers){
            reponse += ouvrier.getNom() + ",";
        }
        return reponse + "\n";
    }

    public void envoyerTravaillerOuvrier(Ouvrier ouvrier){
        this.ouvriers.add(ouvrier);
    }

    public void retierOuvrier(Ouvrier ouvrier){
        this.ouvriers.remove(ouvrier);
    }

    public boolean estTermine(){ // additionner tout les matériaux des ouvriers dans une hashmap puis comparer avec batiment
        HashMap<Ressource,Integer> totalOuvrier = new HashMap<>();
        for(Ouvrier ouvrier : ouvriers) {
            for (Ressource ressource : ouvrier.getMateriaux().keySet()) {
                if(!totalOuvrier.containsKey(ressource)) {
                    totalOuvrier.put(ressource, ouvrier.getMateriaux().get(ressource));
                } else {
                    totalOuvrier.put(ressource, totalOuvrier.get(ressource)+ouvrier.getMateriaux().get(ressource));
                }
            }
        }
        for(Ressource materiau : batiment.getMateriaux().keySet()){
            if(!(totalOuvrier.get(materiau)>=batiment.getMateriaux().get(materiau))){
                return false;
            }
        }
        return true;
    }
}