import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Num = new int[9];

        for( int i=0 ; i< 9 ; i++){
            Num[i] = Integer.parseInt(br.readLine());
        }

        int MaxNum = 0;
        int MaxNummIndex = 0;

        for( int i=0; i<9; i++) {
            if(Num[i] > MaxNum) {
                MaxNum = Num[i];
                MaxNummIndex = i;
            }
        }

        bw.write(MaxNum+"\n"+(MaxNummIndex+1));


        bw.flush();
        bw.close();

    }
}

