import java.util.HashMap;

public class Batiment {
    private String libelle;
    private int pointsVictoire;
    private int gainSesterces;
    private HashMap<Ressource,Integer> materiaux;

    Batiment(String libelle, int pointsVictoire, int gainSesterces){
        this.libelle = libelle;
        this.pointsVictoire = pointsVictoire;
        this.gainSesterces = gainSesterces;
        this.materiaux = new HashMap<Ressource,Integer>();
    }

    @Override
    public String toString(){
        String reponse = String.format("%s : Points Victoire -> %d, Gain de Sesterces -> %d\nMatériaux : ",this.libelle, this.pointsVictoire, this.gainSesterces);
        for (Ressource ressource : this.materiaux.keySet()) {
            reponse += String.format("%s -> %d, ", ressource.getLibelle(), this.materiaux.get(ressource));
        }
        return reponse + "\n";
    }

    public HashMap<Ressource,Integer> getMateriaux(){
        return this.materiaux;
    }

    public void ajouterRessource(Ressource ressource, int quantite) {
        this.materiaux.put(ressource, quantite);
    }
}