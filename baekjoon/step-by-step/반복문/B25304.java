import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;


        for(int i = 1; i <= N ; i++ ){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a * b;
        }
        System.out.println( sum==X ? "Yes" : "No" );
    }
}


