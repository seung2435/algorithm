package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no25304 {
    /*
    * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
    * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
    * 영수증에 적힌, 구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액을 보고,
    * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
    * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));


        int tot = Integer.parseInt(bc.readLine());
        int cnt = Integer.parseInt(bc.readLine());
        int hop = 0;

        for (int i = 0; i < cnt; i++) {

            String[]b = bc.readLine().split(" ");

            int price = Integer.parseInt(b[0]);
            int count = Integer.parseInt(b[1]);

            int total  = price * count;

            hop += total;
        }
        if (hop == tot) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
