package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2_1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append("#").append(i).append('\n');
            for (int j = 0; j < coins.length; j++) {
                if (n >= coins[j]) {
                    sb.append(n / coins[j]).append(" ");
                    n %= coins[j];
                } else {
                    sb.append(0).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
