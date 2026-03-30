package Job6;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre un entier : ");
            nums.add(scanner.nextInt());
        }

        double sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        sum = sum / nums.size();

        scanner.close();
        System.out.println(sum);
    }
}
