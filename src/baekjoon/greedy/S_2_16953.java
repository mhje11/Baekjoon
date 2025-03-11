package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 1;
        while (b > a) {
            if (b % 2 == 0) {
                b = multiply(b);
                count++;
            } else if (b % 10 == 1){
                b = add(b);
                count++;
            } else {
                count = -1;
                break;
            }
        }
        if (b < a) {
            count = -1;
        }
        System.out.println(count);

    }

    public static int multiply(int b) {
        return b / 2;
    }

    public static int add(int b) {
        return (b - 1) / 10;
    }
}
