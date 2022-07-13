package loop;

import java.io.*;
import java.util.StringTokenizer;

public class no10951 {
    /*
    * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
    * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    * */
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;

        while( (S = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(S);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);

        }

    }
}
