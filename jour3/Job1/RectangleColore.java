package jour3.Job1;

import java.util.Objects;

class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + "\n couleur = " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        RectangleColore other = (RectangleColore) obj;
        return Objects.equals(couleur, other.couleur);
    }
}
