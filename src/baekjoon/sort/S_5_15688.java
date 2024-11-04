package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//counting sort
public class S_5_15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num + 1000000]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i - 1000000).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
