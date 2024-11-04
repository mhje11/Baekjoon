package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int k = 1; k <= t; k++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int maxProfit = 0;
            int maxPrice = 0;
            for (int i = n - 1; i >= 0; i--) {

                if (arr[i] <= maxPrice) {
                    maxProfit += maxPrice - arr[i];
                } else {
                    maxPrice = arr[i];
                }
            }
            sb.append("#").append(k).append(" ").append(maxProfit).append("\n");
        }
        System.out.println(sb);
    }
}
