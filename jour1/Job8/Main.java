package Job8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre : ");

        double n = scanner.nextInt();
        scanner.close();

        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println(sum);
    }
}