package jour2.Job5;

class A {
    public A() { }
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C() {
        super();
    }
}

class D extends A {
    protected int d = 1;

    public D(int x) {
        super();
        this.d = x;
    }

    public D() {
        super();
    }
}

class E extends D {
    public E() {
        super();
    }
}

class F extends D {
    public F() {
        super();
    }
}

public class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        a = (A) b;
        a = null;
        a = d;
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        int count = 0;
        for (A obj : as) {
            if (obj instanceof B) {
                count++;
            }
        }
        System.out.println("Il y a " + count + " instances de la classe B");
    }

    private static void additionner(A[] as) {
        int sum = 0;
        for (A obj : as) {
            if (obj instanceof D) {
                sum += ((D) obj).d;
            }
        }
        System.out.println("Somme des variables d : " + sum);
    }
}
