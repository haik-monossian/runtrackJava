package jour2.Job3;

public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0.0, 0.0, 10.0, 5.0);
        rect.affiche();
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Surface : " + rect.surface());

        rect.setLargeur(12.5);
        rect.setLongueur(4.0);
        System.out.println("Nouvelle Surface : " + rect.surface());

        Cercle cercle = new Cercle(0.0, 0.0, 5.0);
        cercle.affiche();
        System.out.println("Surface du cercle : " + cercle.surface());
        System.out.println("Le point (3, 4) est à l'intérieur ? " + cercle.isPointInside(3.0, 4.0));
        System.out.println("Le point (6, 0) est à l'intérieur ? " + cercle.isPointInside(6.0, 0.0));

        RectangleColore rectCol = new RectangleColore(5.0, 5.0, 8.0, 4.0, 0xFF0000);
        rectCol.affiche();
        System.out.println("Rectangle Coloré - Surface : " + rectCol.surface());
        System.out.println("Couleur : " + rectCol.getCouleur());
    }
}

class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Rectangle extends Figure {
    private double largeur;
    private double longueur;

    public Rectangle(double x, double y, double largeur, double longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }
}

class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean isPointInside(double px, double py) {
        return Math.pow(px - x, 2) + Math.pow(py - y, 2) <= Math.pow(rayon, 2);
    }
}

class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double x, double y, double largeur, double longueur, int couleur) {
        super(x, y, largeur, longueur);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}
