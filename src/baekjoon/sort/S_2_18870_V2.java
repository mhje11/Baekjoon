package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_2_18870_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
