package jour3.Job4;

public abstract class Personne {
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    protected Personne(int ident, String nomsocial, String adresse) {
        this.identite = ident;
        this.nomSocial = nomsocial;
        this.adresse = adresse;
    }

    public int getIdentite() {
        return identite;
    }

    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public String getNomSocial() {
        return nomSocial;
    }

    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void affiche() {
        System.out.println("ID: " + identite);
        System.out.println("Nom Social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
    }
}
