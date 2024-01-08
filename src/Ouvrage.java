import java.util.*;


public class Ouvrage {
    private String ISBN;
    private String titre;
    private Set<String> auteurs;
    private int annee;
    private String maisonEdition;

    public Ouvrage(String ISBN, String titre, Set<String> auteurs, int annee, String maisonEdition) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteurs = auteurs;
        this.annee = annee;
        this.maisonEdition = maisonEdition;
    }

    // Getters et Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Set<String> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(Set<String> auteurs) {
        this.auteurs = auteurs;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    
    @Override
    public String toString() {
        return "Ouvrage{" +
                "ISBN='" + ISBN + '\'' +
                ", titre='" + titre + '\'' +
                ", auteurs=" + auteurs +
                ", annee=" + annee +
                ", maisonEdition='" + maisonEdition + '\'' +
                '}';
    }

    // Fonction pour vérifier si le nom d'une personne figure parmi les auteurs de l'ouvrage
    public boolean auteurPresent(String nomAuteur) {
        return auteurs.contains(nomAuteur);
    }

    // Fonction pour déterminer si l'ouvrage traite un thème donné
    public boolean traiteTheme(String theme) {
        return titre.toLowerCase().contains(theme.toLowerCase());
    }

}
