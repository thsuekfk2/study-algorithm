import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


  /*
 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다.
 6+8 = 14이다. 새로운 수는 84이다.
 8+4 = 12이다. 새로운 수는 42이다.
 4+2 = 6이다. 새로운 수는 26이다.
 따라서 26의 사이클의 길이는 4이다.
   */

        //입력받은 수가 10보다 작으면 앞에 0을 붙인다.
        //각 자리의 숫자를 더한다.
        //1의 자리수의 숫자와 더한값의 1의 자리 숫자를 합쳐서 새로운 수를 만든다.
        //만약 이 새로운 수가 입력받은 수와 같으면 빠져나간다.
        //이 사이클의 길이를 구한다.
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        int newN = N;
        while(true){
            int N1 = newN%10;
            int N10 = newN/10;
            // 새로운 수 //
            newN = ((newN % 10) * 10) + (N1 + N10) % 10;
            count++;
            if(newN==N) break;
        }

        bw.write(count+"\n");




        bw.flush();
        bw.close();

    }
}
/*
input: 1 2
String[] input = br.readLine().split(" ");
int a = Integer.parseInt(input[0]);
int b = Integer.parseInt(input[1]);

input: 1
int a = Integer.parseInt(br.readLine());

input: 1 2 3 4 5 ..... 100 등 가변적으로 입력받음
-> String[] input = br.readLine().split(" ");
int[] arr = new int[input.length];
for(int i = 0 ; i < arr.length ; i++) {
    arr[i] = Integer.parseInt(input[i]);
}
 */

/*
반복문을 돌린다.
반복문 안에서 숫자를 2개 입력 받는다.
두 숫자가 둘 다 0이라면 출력하지 않고 나온다
아니라면 합해서 출력한
 */
