package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int maxTree = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxTree = Math.max(maxTree, arr[i]);
        }

        long low = 0;
        long high = maxTree;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long wood = getWood(arr, mid);

            if (wood >= m) {
                result = mid;
                low = mid + 1;
            } else  {
                high = mid - 1;
            }
        }

        System.out.println(result);


    }

    private static long getWood(int[] arr, long height) {
        long sum = 0;
        for (int i : arr) {
            if (i > height) {
                sum += i - height;
            }
        }
        return sum;
    }
}
