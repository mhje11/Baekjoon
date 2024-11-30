package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_3_6485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] stopCounts = new int[5001];
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                for (int k = a; k <= b; k++) {
                    stopCounts[k] ++;
                }
            }
            int p = Integer.parseInt(br.readLine());
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < p; j++) {
                int stop = Integer.parseInt(br.readLine());
                sb.append(stopCounts[stop]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
