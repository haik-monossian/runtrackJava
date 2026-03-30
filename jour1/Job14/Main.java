package Job14;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();
        scanner.close();

        String result = "";

        for (char c : String.valueOf(n).toCharArray()) {
            result = c + result;
        }

        int parsedResult = Integer.parseInt(result);

        System.out.print(parsedResult);
    }
}