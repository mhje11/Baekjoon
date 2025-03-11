package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_17266 {
    public static int N;
    public static int M;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(binarySearch());
    }

    public static int binarySearch() {
        int low = 1;
        int high = N;
        int result = N;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canIlluminate(mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static boolean canIlluminate(int H) {
        int lastCovered = 0;

        for (int x : arr) {
            if (lastCovered < x - H) {
                return false;
            }
            lastCovered = x + H;
        }

        return lastCovered >= N;
    }
}
