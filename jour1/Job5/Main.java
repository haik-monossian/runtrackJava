package Job5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre le premier nombre : ");
        int num1 = scanner.nextInt();
        System.out.print("Entre le deuxieme nombre : ");
        int num2 = scanner.nextInt();
        System.out.print("Entre le troisième nombre : ");
        int num3 = scanner.nextInt();

        scanner.close();

        int maximum = 0;

        if (num1 > num2 && num1 > num3) {
            maximum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maximum = num2;
        } else {
            maximum = num3;
        }

        System.out.println(maximum);
    }
}
