package jour2.Job4;

class Vehicule {
    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat;
    }

    public void affiche() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat);
        System.out.println("Prix courant : " + prixCourant);
    }

    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - dateAchat;
        double reduction = 0.01 * age;
        this.prixCourant = Math.max(0.0, this.prixAchat * (1.0 - reduction));
    }
}

class Voiture extends Vehicule {
    private double cylindree;
    private int nbPortes;
    private int puissance;
    private double kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, double cylindree, int nbPortes, int puissance,
            double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée : " + cylindree);
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance);
        System.out.println("Kilométrage : " + kilometrage);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - dateAchat;
        double reduction = 0.02 * age;

        int tranchesKm = (int) Math.round(kilometrage / 10000.0);
        reduction += 0.05 * tranchesKm;

        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            reduction += 0.10;
        } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            reduction -= 0.20;
        }

        this.prixCourant = Math.max(0.0, this.prixAchat * (1.0 - reduction));
    }
}

class Avion extends Vehicule {
    private String typeMoteur;
    private double heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String typeMoteur, double heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Heures de vol : " + heuresVol);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double unit = typeMoteur.equalsIgnoreCase("HELICES") ? 100.0 : 1000.0;
        int tranches = (int) (heuresVol / unit);
        double reduction = 0.10 * tranches;
        this.prixCourant = Math.max(0.0, this.prixAchat * (1.0 - reduction));
    }
}

public class GestionVehicules {
    public static void main(String[] args) {
        int anneeActuelle = 2024;

        Voiture voiture1 = new Voiture("Renault", 2018, 15000, 1.5, 5, 90, 60000);
        Voiture voiture2 = new Voiture("Ferrari", 2022, 250000, 4.0, 3, 600, 5000);

        Avion avion1 = new Avion("Cessna", 2010, 50000, "HELICES", 150);
        Avion avion2 = new Avion("Airbus", 2015, 100000000, "REACTION", 2500);

        System.out.println("--- Voiture 1 (Renault) ---");
        voiture1.calculePrix(anneeActuelle);
        voiture1.affiche();

        System.out.println("\n--- Voiture 2 (Ferrari) ---");
        voiture2.calculePrix(anneeActuelle);
        voiture2.affiche();

        System.out.println("\n--- Avion 1 (HELICES) ---");
        avion1.calculePrix(anneeActuelle);
        avion1.affiche();

        System.out.println("\n--- Avion 2 (REACTION) ---");
        avion2.calculePrix(anneeActuelle);
        avion2.affiche();
    }
}
