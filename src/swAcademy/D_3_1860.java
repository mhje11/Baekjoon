package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_3_1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            //m 초마다 k개
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            boolean isService = true;
            for (int j = 0; j < n; j++) {
                int arrivalTime = arr[j];

                int currentBread = (arrivalTime / m) * k;

                if (currentBread < j + 1) {
                    isService = false;
                    break;
                }
            }
            sb.append("#").append(i).append(" ");
            if (isService) {
                sb.append("Possible").append('\n');
            } else {
                sb.append("Impossible").append('\n');
            }
        }
        System.out.println(sb);
    }
}
