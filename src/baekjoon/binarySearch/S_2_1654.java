package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_2_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];


        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long min = 1;
        long max = arr[arr.length - 1];
        long result = 0;

        while (min <= max) {
            long mid = (min + max) / 2;
            long count = 0;

            for (int i : arr) {
                count += i / mid;
            }

            if (count >= n) {
                result = mid;
                min = mid + 1;
            } else {
                max =  mid - 1;
            }
        }

        System.out.println(result);
    }
}
