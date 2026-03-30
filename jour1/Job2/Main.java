package Job2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");

        String name = scanner.nextLine();

        System.out.println(name);

        scanner.close();
    }
}
