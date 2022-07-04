package loop;

import java.io.*;
import java.util.StringTokenizer;

public class no10871 {
    /*
    * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
    * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
    * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
    * */
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());

            if (tmp < X){
                sb.append(tmp).append(' ');
            }
        }
        System.out.println(sb);


    }
}
