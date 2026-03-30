package Job9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un age : ");

        int age = scanner.nextInt();
        scanner.close();

        if (age < 18) {
            System.out.println("tu es mineur");
        } else {
            System.out.println("tu es majeur");
        }
    }
}