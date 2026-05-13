public class Outil {
    private String libelle;
    private int quantite;
    private int prix;
    private Ressource ressource;

    Outil(String libelle, Ressource ressource, int quantite, int prix) {
        this.libelle = libelle;
        this.ressource = ressource;
        this.quantite = quantite;
        this.prix = prix;
    }

    @Override
    public String toString(){
        return String.format("%s : qte -> %d, prix -> %d",this.libelle);
    }

}
