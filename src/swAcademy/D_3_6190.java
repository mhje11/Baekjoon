package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_6190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int num = arr[j] * arr[k];
                    String s = String.valueOf(num);
                    if (isIncrease(s)) {
                        max = Math.max(max, num);
                    }
                }
            }
            if (max == Integer.MIN_VALUE) {
                sb.append("#").append(i).append(" ").append(-1).append('\n');
            } else
            sb.append("#").append(i).append(" ").append(max).append('\n');
        }
        System.out.println(sb);
    }


    public static boolean isIncrease(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
