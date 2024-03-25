package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//dp
public class S_3_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        if (n == 0 || n == 1 || n == 2) {
            System.out.println(n);
        } else {

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 1; i < n - 1; i++) {
                dp[i + 2] = (dp[i] + dp[i + 1]) % 10007;
            }
            System.out.println(dp[n]);
        }
    }
}
