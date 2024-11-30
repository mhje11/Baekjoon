package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_5431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                arr[j] = 1;
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                int student = Integer.parseInt(st.nextToken());
                arr[student] = 0;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                if (arr[j] == 1) {
                    list.add(j);
                }
            }
            Collections.sort(list);
            sb.append("#").append(i).append(" ");
            for (Integer integer : list) {
                sb.append(integer).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
