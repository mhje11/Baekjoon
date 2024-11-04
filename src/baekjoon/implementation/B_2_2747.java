package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            int[] f = new int[n + 1];
            f[0] = 0;
            f[1] = 1;

            for (int i = 2; i < n + 1; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            System.out.println(f[n]);
        }
    }
}
