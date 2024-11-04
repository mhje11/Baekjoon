package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_4_9663 {
    static int N;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        backtracking(0);
        System.out.println(count);
    }

    public static void backtracking(int depth) {
      if (depth == N) {
          count++;
          return;
      }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (possibility(depth)) {
                backtracking(depth + 1);
            }
        }
    }

    public static boolean possibility(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i]) ) {
                return false;
            }
        }
        return true;
    }
}
