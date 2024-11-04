package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //n이 1이면 1 --> 1
        //n이 2이면 10 ~ 11 -- > 2 ~ 3
        //n이 3이면 100 ~ 111 --> 4 ~ 7
        //n이 4이면 1000 ~ 1111 --> 8 ~ 15
        long[] dp = new long[n + 1];
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
            System.out.println(dp[n]);
        }

    }
}
