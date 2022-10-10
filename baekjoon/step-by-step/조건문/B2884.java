import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int resultM = M - 45;

        if(resultM < 0){
            if(H-1 < 0){
                System.out.print(24-(-H)-1 + " ");
            }else{
                System.out.print(H-1 + " ");
            }
            System.out.print(60-(-resultM));
        }else{
            System.out.print(H + " ");
            System.out.print(resultM);
        }

    }
}

