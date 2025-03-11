package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_4_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int digit = 1;
        int start = 1;
        while (start <= N) {
            int end = Math.min(N, start * 10 - 1);
            count += (end - start + 1) * digit;
            digit++;
            start *= 10;
        }

        System.out.println(count);
    }
}
