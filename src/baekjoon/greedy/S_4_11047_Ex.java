package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_11047_Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < coins.length; i++) {
            if (coins[coins.length - 1 - i] <= k) {
                count += k / coins[coins.length - 1 - i];
                k = k % coins[coins.length - 1 - i];
            }
        }
        System.out.println(count);


    }
}
