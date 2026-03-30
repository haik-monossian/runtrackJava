package Job8;

public class Main {
    public static void main(String[] args) {

        int factoriel = 1;

        for (int i = 1; i <= 8; i++) {
            factoriel *= i;
        }

        System.out.print(factoriel);
    }
}