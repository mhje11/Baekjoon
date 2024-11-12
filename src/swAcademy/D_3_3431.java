package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_3431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            sb.append("#").append(i).append(" ");
            if (x > u) {
                sb.append(-1).append('\n');
            } else if (x <= l) {
                sb.append(l - x).append('\n');
            } else if (x >= l && x <= u) {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
