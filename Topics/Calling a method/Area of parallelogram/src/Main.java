import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int height = scanner.nextInt();
        final int base = scanner.nextInt();
        countAreaOfParallelogram(height, base);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}