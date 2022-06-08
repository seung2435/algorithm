package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class no3052 {
    /* 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
    * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
    *  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
    * */
    public static void main (String[] args) {
        /* HashSet 사용 */
//        Scanner io = new Scanner(System.in);
//        HashSet<Integer> rest = new HashSet<Integer>();
//
//        for(int i=0; i<4; i++){
//            rest.add(io.nextInt()%3);
//        }
//        io.close();
//        System.out.println(rest.size());

        /* Array 사용 */
        Scanner input = new Scanner(System.in);

        int[] arry = new int[10];
        int tmp;
        int cnt = 0;

        for(int i=0; i<10; i++){
            arry[i] = input.nextInt()%3;
        }

        for(int i=0; i<10; i++){
            tmp = 0;
            for(int j=i+1; j<10; j++){
                if(arry[i] == arry[j]) {
                    tmp++;
                }
            }
            if(tmp==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
