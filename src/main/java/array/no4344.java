package array;

public class no4344 {
    /*
    * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
    * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
    * */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();  // 테스트 케이스 수 입력받기

        for(int i=0; i<C; i++) {
            int[] N = new int[sc.nextInt()]; // 학생 수 입력받기
            int sum = 0; // 학생들의 총 점수
            int avg = 0; // 학생들의 평균 점수
            int standard_cnt = 0;  // 평균 이상의 학생 수
            float standard_avg = 0;  // 평균 점수보다 높은 학생 수 비율(%)

            // 입력받은 학생 수 만큼을 반복하여 N 배열의 인덱스에 각각 저장 합니다.
            for(int j=0; j<N.length; j++) {
                N[j] = sc.nextInt();  // 입력받은 값을 N 배열에 저장
                sum += N[j]; // 학생들의 총 점수를 sum 변수에 저장
            }

            avg = sum/(N.length); // 총점수/학생수를 계산하여 평균 점수를 avg 변수에 저장

            for(int k=0; k<N.length; k++) {
                if(N[k] > avg) {
                    standard_cnt++;  // 평균 점수보다 높은(초과) 학생 수를 standard_cnt 변수에 저장
                }
            }

            /*
            소수점 셋째 자리까지 출력 해야하므로 학생 수(standard_cnt)를 float으로 형변환 해준 뒤
            폄균 점수보다 높은 학생 수/총 학생 수를 계산하고 100을 곱해주면
            평균을 넘는 학생들의 비율을 알아낼 수 있습니다.

            이후 마지막으로 String.format을 사용하여 소수점 3자리까지 표시합니다.
            */

            standard_avg = (float)standard_cnt/N.length * 100;
            System.out.println(String.format("%.3f", standard_avg)+"%");
        }
    }
}
