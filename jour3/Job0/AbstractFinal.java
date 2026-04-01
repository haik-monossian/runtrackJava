package jour3.Job0;

public class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        tab[0] = new A(); // La classe A est déclarée avec le modificateur abstract (ligne 14). En Java,
                          // une classe abstraite est incomplète par définition et ne peut pas être
                          // instanciée. Le mot-clé new ne peut donc pas être utilisé avec A.
        tab[1] = new B();
        tab[2] = new C();
        tab[1].b = 2; // Le tableau tab est de type A[]. Bien que tab[1] contienne une instance de la
                      // classe B, le type de la référence à cet index est A. Le compilateur vérifie
                      // la validité des membres à partir du type de la référence. Comme la classe
                      // abstraite A ne définit pas de champ b (celui-ci n'existant que dans la
                      // sous-classe B), l'accès direct est impossible sans un transtypage (cast)
                      // explicite.
        ((C) tab[2]).c = 3; // Dans la classe C, le champ c est déclaré avec le modificateur final et
                            // initialisé à 1 (ligne 23). Le modificateur final empêche toute modification
                            // ultérieure de la valeur d'une variable après son initialisation. Tenter de
                            // lui assigner la valeur 3 provoque donc une erreur de compilation.
    }
}

abstract class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    final double c = 1;
}

abstract class D extends A {
    double d;

    int operation(int a) {
        return (a * 2);
    }

    abstract int calcul(int b) //Lorsqu'une méthode est déclarée avec le modificateur abstract, elle ne doit pas posséder de corps (pas d'accolades { }). En Java, la signature d'une telle méthode doit obligatoirement se terminer par un point-virgule (;). Dans la classe D, le point-virgule est manquant à la fin de la déclaration de la méthode calcul.
}