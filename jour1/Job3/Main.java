package Job3;

public class Main {
    public static void main(String[] args) {
        int[] T = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(T[0]);
        System.out.println(T[1]);
        System.out.println(T[5]);
        System.out.println(T[9]);
        System.out.println(T[10]);
    }
}

// 0
// 1
// 5
// 9
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10
// out of bounds for length 10
// at Job3.Main.main(Main.java:11)