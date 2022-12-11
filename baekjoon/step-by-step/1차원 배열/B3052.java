import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] arr = new Integer[10];
        //HashSet 방법 1)
        //HashSet<Integer> h = new HashSet<Integer>();
        //
        //
        //for( int i=0; i<10 ; i++){
        //    h.add(Integer.parseInt(br.readLine()) % 42);
        //}
        //
        //bw.write(h.size()+"");
        
        //방법 2)
        int count = 0;
        for( int i=0; i<10 ; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for( int i=0; i<10; i++){
            int tmp = 0;
            for( int j=i+1; j<10; j++){
                if(arr[i]==arr[j]){
                    tmp++;
                }
            }
            if(tmp==0){
                count ++;
            }
        }

        bw.write(count+"");

        bw.flush();
        bw.close();

    }
}

