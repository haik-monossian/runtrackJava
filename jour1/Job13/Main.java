package Job13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        while (n > 9) {
            System.out.print("Entrez un entier inférieur à 9 : ");
            n = scanner.nextInt();
        }
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }
}