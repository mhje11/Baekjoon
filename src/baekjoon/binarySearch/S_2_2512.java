package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_2_2512 {
    public static int N;
    public static int M;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        System.out.println(binarySearch());
    }

    public static int binarySearch() {
        int low = 0;
        int high = arr[arr.length - 1];
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int total = 0;
            for (int i : arr) {
                if (i > mid) {
                    total += mid;
                } else {
                    total += i;
                }
            }

            if (total <= M) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
