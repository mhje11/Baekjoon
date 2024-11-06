package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int current = 0;
            sb.append("#").append(i);
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());

                if (command == 0) {
                    sum += current;
                } else if (command == 1) {
                    int a = Integer.parseInt(st.nextToken());
                    current += a;
                    sum += current;
                } else if (command == 2) {
                    int a = Integer.parseInt(st.nextToken());
                    current -= a;
                    if (current < 0) {
                        current = 0;
                    }
                    sum += current;
                }
            }
            sb.append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
