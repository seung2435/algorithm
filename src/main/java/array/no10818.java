package array;

import java.util.Arrays;
import java.util.Scanner;

public class no10818 {
    /*
    * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
    * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
    * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
    * */
    public static void main (String[] args){
        Scanner io = new Scanner(System.in);
        int N = io.nextInt();
        int[] arry = new int[N];

        for(int i=0; i<N; i++){
            arry[i] = io.nextInt();
        }

        io.close();
        Arrays.sort(arry);
        System.out.print(arry[0] + " " + arry[N - 1]);
    }
}
