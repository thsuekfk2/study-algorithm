import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int reward = 0;
        if (A == B && B == C && A == C) {
            reward = 10000 + (A * 1000);
        }
        else if(A == C||A == B ){
            reward = 1000 + (A * 100);
        }else if(B == C || B == A ){
            reward = 1000 + (B * 100);
        }else if(C == A || C == B ){
            reward = 1000 + (C * 100);
        }else{
            if((A > B && B > C) || (A > C && C > B)){
                reward =  A * 100;
            }else if( (B > A && A > C )|| (B > C && C > A)) {
                reward =  B * 100;
            }else if ( (C > A && A > B )||(  C > B && B > A)){
                reward =  C * 100;
            }
        }
        System.out.println(reward);
    }
}


