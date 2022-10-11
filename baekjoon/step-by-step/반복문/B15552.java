import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //:Scanner와 유사.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //:System.out.println();과 유사

        int T = Integer.parseInt(br.readLine()); //readLine()은 입력값으로 들어온 데이터를 한 줄로 읽어서 String으로 바꾸는 메소드
        int SUM ;

        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            SUM = a + b;
            bw.write( SUM + "\n");
        }
        bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
        bw.close();
    }
}


