package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_3_10818 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[N - 1]);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }


}
