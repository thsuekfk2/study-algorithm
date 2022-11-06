import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++){
            if( Integer.parseInt(input[i]) == v) {
                count ++;
            }
        }

        bw.write(count+"");

        bw.flush();
        bw.close();

    }
}

