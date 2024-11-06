package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_21425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int count = 0;
            if (a < b) {
                while (a <= n && b <= n) {
                    if (a < b) {
                        a += b;
                        count++;
                    } else {
                        b += a;
                        count++;
                    }

                }
            } else {
                while (b <= n && a <= n) {
                    if (a < b) {
                        a += b;
                        count++;
                    } else {
                        b += a;
                        count++;
                    }
                }
            }

            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
