package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_3_5948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int[] arr = new int[7];
            HashSet<Integer> set = new HashSet<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < 7; j++) {
                for (int k = j + 1; k < 7; k++) {
                    for (int l = k + 1; l < 7; l++) {
                        set.add(arr[j] + arr[k] + arr[l]);
                    }
                }
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list, Collections.reverseOrder());
            sb.append("#").append(i).append(" ").append(list.get(4)).append('\n');
        }
        System.out.println(sb);
    }
}
