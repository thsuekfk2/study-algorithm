import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        /*
        List<Integer> list = new ArrayList<>();
        while(true) {
            //두 숫자를 입력 받는다.
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            // 만약 두 숫자가 0이면 저장을 하지 않고 0이면 빠져나간다.
            if(a == 0 && b == 0) break;
            //두 숫자를 더하고 그걸 배열에 저장한다
            list.add(a + b);
        }
        for(int i  = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        */
        while(true) {
            //두 숫자를 입력 받는다.
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            // 두 숫자가 모두 0이라면 탈출한다.
            if(a == 0 && b == 0) break;
            // 출력한다.
            System.out.println(a + b);
        }


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