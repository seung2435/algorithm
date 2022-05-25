package conditional;

import java.util.Scanner;

public class no1330 {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);

        int A = io.nextInt();
        int B = io.nextInt();

        io.close();

        String sol = (A>B) ? ">" : ((A<B) ? "<" : "==" );
        System.out.println(sol);

    }
}
