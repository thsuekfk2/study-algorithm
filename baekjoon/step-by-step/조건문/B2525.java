import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int count = (B + C) / 60;
        int H = (A + count);
        int M = (B + C);

        System.out.println((H % 24) + " " + (M % 60));
    }
}

