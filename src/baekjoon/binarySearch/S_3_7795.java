package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_3_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int count = 0;

            int[] arr1 = new int[a];
            int[] arr2 = new int[b];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < b; k++) {
                arr2[k] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int j = 0; j < arr1.length; j++) {
                int pos = Arrays.binarySearch(arr2, arr1[j]);

                if (pos < 0) {
                    pos = -(pos + 1);
                }

                count += pos;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
