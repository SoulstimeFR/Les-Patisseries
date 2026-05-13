import java.util.List;

public class Main {
    public static void main(String[] args) {

        // création ressources
        Ressource pierre = new Ressource("Pierre");
        Ressource bois = new Ressource("Bois");
        Ressource architecture = new Ressource("Architecture");
        Ressource decoration = new Ressource("Décoration");

        System.out.print(pierre);
        System.out.print(bois);
        System.out.print(architecture);
        System.out.print(decoration + "\n");

        // test création bâtiment
        Batiment maison = new Batiment("Maison",1,1);
        maison.ajouterRessource(pierre,2);
        maison.ajouterRessource(bois,3);
        maison.ajouterRessource(architecture,1);
        maison.ajouterRessource(decoration,2);

        System.out.print(maison + "\n");

        // test catégorie + assert
        Categorie manoeuvre = new Categorie("Manoeuvre",3);

        System.out.print(manoeuvre + "\n");

        // test création ouvrier + assert cout et quantiteByRessource
        Ouvrier paul = new Ouvrier("Paul",manoeuvre);
        paul.ajouterRessource(pierre,2);
        paul.ajouterRessource(bois,3);
        paul.ajouterRessource(architecture,1);
        paul.ajouterRessource(decoration,2);

        System.out.print(paul + "\n");
        assert paul.cout() == 3;
        assert paul.quantiteByRessource(pierre) == 2;

        // test chantier
        Chantier ch1 = new Chantier(maison);
        ch1.envoyerTravaillerOuvrier(paul);

        System.out.print(ch1 + "\n");
        System.out.print(ch1.estTermine());

    }
}import java.util.List;

public class Main {
    public static void main(String[] args) {

        // création ressources
        Ressource pierre = new Ressource("Pierre");
        Ressource bois = new Ressource("Bois");
        Ressource architecture = new Ressource("Architecture");
        Ressource decoration = new Ressource("Décoration");

        System.out.print(pierre);
        System.out.print(bois);
        System.out.print(architecture);
        System.out.print(decoration + "\n");

        // test création bâtiment
        Batiment maison = new Batiment("Maison",1,1);
        maison.ajouterRessource(pierre,2);
        maison.ajouterRessource(bois,3);
        maison.ajouterRessource(architecture,1);
        maison.ajouterRessource(decoration,2);

        System.out.print(maison + "\n");

        // test catégorie + assert
        Categorie manoeuvre = new Categorie("Manoeuvre",3);

        System.out.print(manoeuvre + "\n");

        // test création ouvrier + assert cout et quantiteByRessource
        Ouvrier paul = new Ouvrier("Paul",manoeuvre);
        paul.ajouterRessource(pierre,2);
        paul.ajouterRessource(bois,3);
        paul.ajouterRessource(architecture,1);
        paul.ajouterRessource(decoration,2);

        System.out.print(paul + "\n");
        assert paul.cout() == 3;
        assert paul.quantiteByRessource(pierre) == 2;

        // test chantier
        Chantier ch1 = new Chantier(maison);
        ch1.envoyerTravaillerOuvrier(paul);

        System.out.print(ch1 + "\n");
        System.out.print(ch1.estTermine());

    }
}