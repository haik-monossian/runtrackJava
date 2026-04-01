package jour3.Job2;

abstract class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public abstract void afficher();
}

class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
        System.out.println("Un nouveau terrain.");
    }

    @Override
    public void afficher() {
        String c = "";
        switch (couleur) {
            case 'B':
                c = "blanc";
                break;
            case 'b':
                c = "bleu";
                break;
            case 'n':
                c = "noir";
                break;
            case 'r':
                c = "rouge";
                break;
            case 'v':
                c = "vert";
                break;
        }
        System.out.println("Un terrain " + c + ". Son coût est de " + cout + ".");
    }
}

class Creature extends Carte {
    private String nom;
    private int degats;
    private int vie;

    public Creature(int cout, String nom, int degats, int vie) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
        System.out.println("Une nouvelle créature.");
    }

    @Override
    public void afficher() {
        System.out.println("Une créature " + nom + " " + degats + "/" + vie + ". Son coût est de " + cout + ".");
    }
}

class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(int cout, String nom, String explication) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Un nouveau sortilège.");
    }

    @Override
    public void afficher() {
        System.out.println("Un sortilège " + nom + ". Son coût est de " + cout + ". " + explication);
    }
}

class Jeu {
    private Carte[] cartes;

    public Jeu() {
        cartes = new Carte[10];
    }

    public void piocher(Carte carte) {
        for (int i = 0; i < 10; i++) {
            if (cartes[i] == null) {
                cartes[i] = carte;
                return;
            }
        }
    }

    public void jouer() {
        for (int i = 0; i < 10; i++) {
            if (cartes[i] != null) {
                System.out.println("On joue une carte :");
                cartes[i].afficher();
                cartes[i] = null;
                return;
            }
        }
    }

    public void afficher() {
        for (Carte carte : cartes) {
            if (carte != null) {
                carte.afficher();
            }
        }
    }
}

public class Magic {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        jeu.piocher(new Terrain('B'));
        jeu.piocher(new Creature(6, "Grizly", 4, 4));
        jeu.piocher(new Sortilege(1, "Eclair", "Inflige 3 points de dégâts."));

        System.out.println("--- Contenu du jeu ---");
        jeu.afficher();

        System.out.println("--- Action de jouer ---");
        jeu.jouer();

        System.out.println("--- Contenu du jeu après avoir joué ---");
        jeu.afficher();
    }
}
