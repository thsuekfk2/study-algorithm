import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        double M = 0;
        double sum = 0;
        for(int i = 0 ; i < N ; i++) {
            int num = scanner.nextInt();
            if(num > M){
                M = num;
            }
            sum += num;
        }


        System.out.println( sum/M * 100 / N);

    }
}

