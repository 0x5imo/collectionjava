import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> auteurs1 = new HashSet<>();
        auteurs1.add("Simo");
        auteurs1.add("zaid");
        Ouvrage simonadi = new Ouvrage("1", "how to be nadi like simo", auteurs1, 2022, "Esition");

        Set<String> auteurs2 = new HashSet<>();
        auteurs2.add("jassim");
        Ouvrage zaidnadi = new Ouvrage("2", "how to be nadi like zaid", auteurs2, 2021, "Esition");

        // Créei l objet biblio
        Bibliotheque bibliotheque = new Bibliotheque();

        // zid les ouvrages l biblio
        bibliotheque.ajouterOuvrage(simonadi);
        bibliotheque.ajouterOuvrage(zaidnadi);

        // Affichi liste des ouvrages
        System.out.println("Ouvrages li kaynin:");
        for (Ouvrage ouvrage : bibliotheque.ouvrages.values()) {
            System.out.println(ouvrage);
        }

        // 9lb 3la ouvrage b ISBN
        String isbnRecherche = "123456789";
        Ouvrage ouvrageRecherche = bibliotheque.rechercherParISBN(isbnRecherche);
        System.out.println("\nRecherche par ISBN '" + isbnRecherche + "':");
        if (ouvrageRecherche != null) {
            System.out.println(ouvrageRecherche);
        } else {
            System.out.println("ouvrage d had ISBN makaynch.");
        }

        // 9lb 3la ouvrages b thème
        String themeRecherche = "Titre";
        List<Ouvrage> ouvragesParTheme = bibliotheque.rechercherParTheme(themeRecherche);
        System.out.println("\nRecherche par thème '" + themeRecherche + "':");
        if (!ouvragesParTheme.isEmpty()) {
            for (Ouvrage ouvrage : ouvragesParTheme) {
                System.out.println(ouvrage);
            }
        } else {
            System.out.println("ouvrage b had Thème makaynch.");
        }

        // Affichi liste d ouvrage dyal wa7d l auteur
        String auteurRecherche = "Auteur1";
        List<Ouvrage> ouvragesParAuteur = bibliotheque.ouvragesParAuteur(auteurRecherche);
        System.out.println("\nOuvrages écrits par l'auteur '" + auteurRecherche + "':");
        if (!ouvragesParAuteur.isEmpty()) {
            for (Ouvrage ouvrage : ouvragesParAuteur) {
                System.out.println(ouvrage);
            }
        } else {
            System.out.println("ouvrage d had l'auteur makaynch.");
        }
    }
}
