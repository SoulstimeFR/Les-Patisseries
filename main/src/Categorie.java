public class Categorie {
    private String libelle;
    private int salaire;

    Categorie(String libelle, int salaire){
        this.libelle = libelle;
        this.salaire = salaire;
    }

    @Override
    public String toString(){
        return String.format("%s : %d Sesterces\n", this.libelle, this.salaire);
    }

    public String getLibelle(){
        return this.libelle;
    }

    public int getSalaire(){
        return this.salaire;
    }
}
