package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int range = d * 2 + 1;

            sb.append("#").append(i).append(" ");
            if (n % range == 0) {
                sb.append(n / range).append('\n');
            } else {
                sb.append(n / range + 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
