package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1193_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int n = 1;
        while (x > n * (n + 1) / 2) {
            n++;
        }

        int k = x - (n * (n - 1) / 2);

        if (n % 2 == 0) {
            System.out.println(k + "/" + (n + 1 - k));
        } else {
            System.out.println((n + 1 - k) + "/" + k);
        }
    }
}
