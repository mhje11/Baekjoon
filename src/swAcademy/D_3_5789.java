package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for (int j = 1; j <= q; j++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                for (int k = l - 1; k <= r - 1; k++) {
                    arr[k] = j;
                }
            }

            sb.append("#").append(i).append(" ");
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
