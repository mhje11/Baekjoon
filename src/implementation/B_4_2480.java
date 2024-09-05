package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;
        int max = 0;

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                result = 1000 + a * 100;
            } else {
                result = 1000 + b * 100;
            }
        } else {
            if (a > b) {
                if (c > a) {
                    max = c;
                }
                else {
                    max = a;
                }
            }
            else {
                if (c > b) {
                    max = c;
                } else {
                    max = b;
                }
            }
            result = max * 100;
        }

        System.out.println(result);
    }
}
