package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_2_2805_V2 {
    public static int N;
    public static int M;
    public static List<Integer> trees = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            trees.add(Integer.parseInt(st.nextToken()));
        }
        int result = binarySearch();
        System.out.println(result);

    }

    public static int binarySearch() {
        int low = 0;
        int high = Collections.max(trees);
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            long height = 0;
            for (Integer tree : trees) {
                if (tree > mid) {
                    height += (long) tree - mid;
                }
            }
            if (height >= M) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
