package dynamicProgramming;

import java.io.*;
import java.math.BigInteger;
//dp
//long으로도 커버안돼서 BigInteger로 처리해야함

public class S_5_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("1");
        }else if (n == 0) {
            bw.write("0");
        }else {
            BigInteger[] dp = new BigInteger[n + 1];
            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 2].add(dp[i - 1]);
            }
            bw.write(dp[n] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
