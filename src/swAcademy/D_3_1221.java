package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_3_1221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] number = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                String s = st.nextToken();
                for (int k = 0; k < number.length; k++) {
                    if (s.equals(number[k])) {
                        arr[j] = k;
                    }
                }
            }
            Arrays.sort(arr);
            sb.append("#").append(i).append("\n");
            for (int j = 0; j < arr.length; j++) {
                sb.append(number[arr[j]]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
