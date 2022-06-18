package conditional;

import java.util.Scanner;

public class no2884 {
    /* 현재 상근이가 설정한 알람 시각이 주어졌을 때, "45분 일찍 알람 설정하기" 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
    * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
    * 입력 시간은 24시간 표현을 사용한다.
    * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
    * */

    public static void main (String[] args) {
        Scanner io = new Scanner(System.in);
        int H = io.nextInt();
        int M = io.nextInt();
        io.close();

        if(M>=45){
            M = M-45;
        }else{
            M = 60-(45-M);
            if(H==0){
                H = 23;
            }else{
                H = H-1;
            }
        }

        System.out.println(H+" "+M);
    }

}
