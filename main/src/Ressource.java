public class Ressource {
    private String libelle;

    Ressource(String libelle){
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Ressource : " + this.libelle + "\n";
    }

    public String getLibelle(){
        return this.libelle;
    }
}
