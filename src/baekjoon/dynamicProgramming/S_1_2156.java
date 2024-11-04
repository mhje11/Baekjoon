package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(arr[1]);
            return;
        }

        if (n == 2) {
            System.out.println(arr[1] + arr[2]);
            return;
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        //dp[i - 1] i 번째 잔을 마시지 않음
        //dp[i - 2] + arr[i] i번째 잔을 마시고 i - 1 번째 잔을 안마심
        //dp[i - 3] + arr[i - 1] + arr[i] i번째 잔과 i - 1번째 잔을 연속해서 마심
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }

        System.out.println(dp[n]);
    }
}
