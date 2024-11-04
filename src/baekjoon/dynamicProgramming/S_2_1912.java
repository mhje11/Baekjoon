package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr[0] = Integer.parseInt(st.nextToken());

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }


        System.out.println(maxSum);


    }
}
