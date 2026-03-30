package Job4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre : ");

        int number = scanner.nextInt();

        System.out.println(number * number + "²");

        scanner.close();
    }
}

// 0
// 1
// 5
// 9
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10
// out of bounds for length 10
// at Job3.Main.main(Main.java:11)