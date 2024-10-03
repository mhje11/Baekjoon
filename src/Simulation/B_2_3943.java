package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_3943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int max = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 1) {
                sb.append("1").append('\n');
                continue;
            }
            while (n != 1) {
                if (n % 2 == 0) {
                    max = Math.max(n, max);
                    n /= 2;
                }
                else {
                    max = Math.max(n, max);
                    n *= 3;
                    n += 1;
                }
            }
            sb.append(max).append('\n');
        }
        System.out.println(sb);
    }
}
