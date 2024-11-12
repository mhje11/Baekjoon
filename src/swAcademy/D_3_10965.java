package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_10965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = findMinMultiplier(n);
            sb.append("#").append(i).append(" ").append(result).append('\n');
        }
        System.out.println(sb);
    }

    public static int findMinMultiplier(int n) {
        int multiplier = 1;
        for (int i = 2; i * i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count % 2 != 0) {
                multiplier *= i;
            }
        }
        if (n > 1) {
            multiplier *= n;
        }
        return multiplier;
    }
}
