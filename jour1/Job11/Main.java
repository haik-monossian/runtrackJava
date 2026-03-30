package Job11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un entier : ");
        int num = scanner.nextInt();
        scanner.close();

        int factoriel = 1;

        for (int i = 1; i <= num; i++) {
            factoriel *= i;
        }

        System.out.print(factoriel);
    }
}