package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = dp[1] + arr[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            sb.append(dp[k] - dp[a - 1]).append('\n');
        }

        System.out.println(sb);

    }
}
