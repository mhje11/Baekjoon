package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(power(a, b, c));

    }

    public static long power(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }
        long half = power(a, b / 2, c) % c;
        if (b % 2 == 0) {
            return (half * half) % c;
        } else {
            return (a * half % c * half) % c;
        }
    }
}
