package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1_11726_Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];


        if (n == 2) {
            System.out.println(2);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;
            for (int i = 4; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
            }

            System.out.println(dp[n]);
        }
    }
}
