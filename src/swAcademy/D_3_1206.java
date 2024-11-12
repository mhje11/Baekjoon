package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for (int j = 2; j <= arr.length - 3; j++) {
                int current = arr[j];
                int left = Math.max(arr[j - 2], arr[j - 1]);
                int right = Math.max(arr[j + 2], arr[j + 1]);
                int maxHeight = Math.max(left, right);
                if (current > maxHeight) {
                    sum += current - maxHeight;
                }
            }
            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
