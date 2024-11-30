package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_3_9229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int snack1 = 0;
            int snack2 = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                snack1 = arr[j];
                if (snack1 > m) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    int current = 0;
                    snack2 = arr[k];
                    current = snack1 + snack2;
                    if (current <= m) {
                        max = Math.max(max, current);
                    }
                }
            }
            if (max == 0) {
                max = -1;
            }
            sb.append("#").append(i).append(" ").append(max).append('\n');
        }
        System.out.println(sb);
    }
}
