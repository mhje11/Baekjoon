package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_2806_review2 {
    static int[] arr;
    static int N;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            count = 0;
            backtracking(0);
            sb.append("#").append(i).append(" ").append(count).append('\n');
        }
        System.out.println(sb);

    }

    public static void backtracking(int depth) {
        if (depth == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (isPossible(depth)) {
                backtracking(depth + 1);
            }
        }
    }

    public static boolean isPossible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[i] == arr[col]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
