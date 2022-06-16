package array;

import java.util.Scanner;

public class no2577 {
    /*
     * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
     * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
     * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
     * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
     * 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
     */
    public static void main (String[] args) {
        Scanner io = new Scanner(System.in);
        int A = io.nextInt();
        int B = io.nextInt();
        int C = io.nextInt();

        String num = Integer.toString(A*B*C);

        int[] arry = new int[10];
        for(int i=0; i<num.length(); i++){
            int tmp = Integer.parseInt(num.substring(i,i+1));
            int value = arry[tmp];
            arry[tmp] = value+1;
        }
        for(int i=0; i<arry.length; i++){
            System.out.println(arry[i]);
        }
    }
}
