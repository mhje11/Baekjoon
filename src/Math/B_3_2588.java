package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(b % 10 * a);
        System.out.println((b / 10) % 10 * a);
        System.out.println(b / 100 * a);
        System.out.println(a * b);
    }
}
