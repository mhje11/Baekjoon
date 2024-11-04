package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1]);

            if (i + arr[i][0] - 1 <= n) {
                dp[i + arr[i][0] - 1] = Math.max(dp[i + arr[i][0] - 1], dp[i - 1] + arr[i][1]);
            }
        }

        System.out.println(dp[n]);
    }
}
