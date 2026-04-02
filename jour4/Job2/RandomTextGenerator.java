package jour4.Job2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomTextGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir la taille de la chaîne de caractères : ");
        int length = scanner.nextInt();
        scanner.close();

        long start = System.currentTimeMillis(); // Time start

        String text = randomString(length);
        writeFile(text);

        long end = System.currentTimeMillis(); // Time finish

        System.out.println("Temps d'éxecution : " + (end - start) + "ms");
    }

    public static String randomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }

    public static void writeFile(String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("jour4/Job2/output.txt"));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}