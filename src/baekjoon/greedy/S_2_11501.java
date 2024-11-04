package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n  = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long maxProfit = 0;
            int maxPrice = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > maxPrice) {
                    maxPrice = arr[i];
                } else {
                    maxProfit += (maxPrice - arr[i]);
                }
            }
            sb.append(maxProfit).append('\n');

        }
        System.out.println(sb);
    }
}
