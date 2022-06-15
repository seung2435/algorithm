package array;

import java.util.Scanner;

public class no2562 {
    /*
    * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    * 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
    * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
    */
    public static void main (String[] args) {
        Scanner io = new Scanner(System.in);

//        int[] arry = new int[9];
//        for(int i=0; i<9; i++){
//            arry[i] = io.nextInt();
//        }
        int[] arry = {3,85,29, 38, 12, 57, 74, 40,  61 };
        int max = 0;
        int cnt = 0;
        int index = 0;

        for (int value : arry){
            cnt++;
            if(value > max) {
                max = value;
                index = cnt;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
