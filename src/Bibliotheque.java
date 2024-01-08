import java.util.*;

public class Bibliotheque {
    Map<String, Ouvrage> ouvrages;

    public Bibliotheque() {
        this.ouvrages = new HashMap<>();
    }

    // Ajouter un ouvrage
    public void ajouterOuvrage(Ouvrage ouvrage) {
        ouvrages.put(ouvrage.getISBN(), ouvrage);
    }

    // Modifier un ouvrage
    public void modifierOuvrage(String ISBN, Ouvrage ouvrage) {
        if (ouvrages.containsKey(ISBN)) {
            ouvrages.put(ISBN, ouvrage);
        }
    }

    // Supprimer un ouvrage
    public void supprimerOuvrage(String ISBN) {
        ouvrages.remove(ISBN);
    }

    // Rechercher un ouvrage par son ISBN
    public Ouvrage rechercherParISBN(String ISBN) {
        return ouvrages.get(ISBN);
    }

    // Rechercher un ouvrage selon un thème (mots clés dans le titre)
    public List<Ouvrage> rechercherParTheme(String theme) {
        List<Ouvrage> result = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages.values()) {
            if (ouvrage.traiteTheme(theme)) {
                result.add(ouvrage);
            }
        }
        return result;
    }

    // Afficher la liste des ouvrages écrits par un auteur donné
    public List<Ouvrage> ouvragesParAuteur(String nomAuteur) {
        List<Ouvrage> result = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages.values()) {
            if (ouvrage.auteurPresent(nomAuteur)) {
                result.add(ouvrage);
            }
        }
        return result;
    }

}