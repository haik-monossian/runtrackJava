package jour2.Job2;

public class Erreur {
    public static void main(String[] args) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a); // Correct
        System.out.println(y.c); // Incorrect - Extend E3 dans E2 pour que ça marche
        System.out.println(z.b); // Correct
        System.out.println(v.c); // Incorrect - Extend E3 dans E4 pour que ça marche
        System.out.println(w.a); // Correct
    }
}

class E1 {
    public int a = 1;
}

class E2 extends E1 {
    public int b = 2;
}

class E3 extends E2 {
    public int c = 3;
}

class E4 extends E1 {
    public int d = 4;
}

class E5 extends E4 {
    public int e = 5;
}
