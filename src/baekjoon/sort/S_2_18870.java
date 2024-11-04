package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S_2_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Integer[] distinct = set.toArray(new Integer[0]);
        Arrays.sort(distinct);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < distinct.length; j++) {
                if (arr[i] == distinct[j]) {
                    sb.append(j).append(' ');
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
