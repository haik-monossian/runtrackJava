package jour3.Job3;

class Forme {
    private String couleur;

    public Forme(String uneCouleur) {
        couleur = uneCouleur;
    }

    public Forme(Forme other) {
        this.couleur = other.couleur;
    }

    public void dessine() {
        System.out.println("Une forme " + couleur);
    }

    public Forme copie() {
        return new Forme(this);
    }
}

class Triangle extends Forme {
    public Triangle(String uneCouleur) {
        super(uneCouleur);
    }

    public Triangle(Triangle autreTriangle) {
        super(autreTriangle);
    }

    @Override
    public void dessine() {
        super.dessine();
        System.out.println("toute pointue");
    }

    @Override
    public Forme copie() {
        return new Triangle(this);
    }
}

class Cercle extends Forme {
    public Cercle(String uneCouleur) {
        super(uneCouleur);
    }

    public Cercle(Cercle autreCercle) {
        super(autreCercle);
    }

    @Override
    public void dessine() {
        super.dessine();
        System.out.println("toute ronde");
    }

    @Override
    public Forme copie() {
        return new Cercle(this);
    }
}

class Collect {
    private Forme collect[];
    private int index;

    public Collect(int indexMax) {
        collect = new Forme[indexMax];
        index = -1;
    }

    public void add(Forme a) {
        if (index < collect.length - 1) {
            ++index;
            collect[index] = a;
        }
    }

    public void dessine() {
        for (int i = 0; i <= index; ++i) {
            collect[i].dessine();
        }
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Forme[] tabFormes = {
                new Cercle("rouge"),
                new Triangle("jaune")
        };

        Collect formes = new Collect(10);

        for (int i = 0; i < tabFormes.length; ++i) {
            formes.add(tabFormes[i].copie());
        }

        formes.dessine();
    }
}
