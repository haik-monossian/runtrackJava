package jour2.Job0;

import java.time.LocalDate;

public class Personne {
    public String nom;
    public String prenom;
    protected LocalDate dateDeNaissance;
    protected String lieuDeNaissance;
    private String adresse;
    private String telephone;

    public Personne(String nom, String prenom, LocalDate dateDeNaissance, String lieuDeNaissance, String adresse,
            String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String nouveauNumero) {
        this.telephone = nouveauNumero;
    }
}

// Public on y a acces partout, Protected seulement dans celle la et classes
// filles et private seulement dans la classe
// seulement pour private et éventuellement protected