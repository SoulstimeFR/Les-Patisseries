import java.util.HashMap;

public class Ouvrier {
    private String nom;
    private Categorie categorie;
    private HashMap<Ressource,Integer> materiaux;

    Ouvrier(String nom, Categorie categorie){
        this.nom = nom;
        this.categorie = categorie;
        this.materiaux = new HashMap<Ressource,Integer>();
    }

    @Override
    public String toString(){
        String reponse = String.format("%s -> %s : ",this.nom, this.categorie.getLibelle());
        for (Ressource ressource : this.materiaux.keySet()) {
            reponse += String.format("%s -> %d, ", ressource.getLibelle(), this.materiaux.get(ressource));
        }
        return reponse + "\n";
    }

    public String getNom(){
        return this.nom;
    }

    public HashMap<Ressource,Integer> getMateriaux(){
        return this.materiaux;
    }

    public void ajouterRessource(Ressource ressource, int quantite) {
        this.materiaux.put(ressource, quantite);
    }

    public int cout(){
        return this.categorie.getSalaire();
    }

    public int quantiteByRessource(Ressource ressource){
        return materiaux.get(ressource);
    }
}