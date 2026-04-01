package jour3.Job4;

public class Client extends Personne {
    private double chiffreAffaire;

    public Client(int ident, String nomsocial, String adresse, double chiffreAffaire) {
        super(ident, nomsocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Chiffre d'Affaire: " + chiffreAffaire);
    }
}
