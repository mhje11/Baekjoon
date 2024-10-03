package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1_2690 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int remainder = -1;
        int max = 0;
        int min = 0;
        int c = a * b;

        while (true) {
            if (remainder == 0) {
                max = a;
                break;
            }
            remainder = a % b;
            a = b;
            b = remainder;
        }
        min = c / max;

        System.out.println(max);
        System.out.println(min);
    }
}
