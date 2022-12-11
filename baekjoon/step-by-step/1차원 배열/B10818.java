import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //input: 1
        int Num = Integer.parseInt(br.readLine());

        //input: 1 2 3 4 5 ..... 100 등 가변적으로 입력받음
        String[] input = br.readLine().split(" ");
        int[] N = new int[Num];
        for(int i = 0 ; i < N.length ; i++) {
            N[i] = Integer.parseInt(input[i]);
        }

        int MaxNum = N[0];
        int MinNum = N[0];

        for (int i=0 ; i <Num ; i++){
            if(N[i] > MaxNum){
                MaxNum = N[i];
            }
            if(N[i] < MinNum){
                MinNum = N[i];
            }
        }

        bw.write(MinNum + " " + MaxNum);

        bw.flush();
        bw.close();

    }
}
