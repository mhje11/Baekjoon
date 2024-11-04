package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S_2_15664 {
    static int N;
    static int M;
    static int[] arr;
    static int[] result;
    static boolean[] isVisited;
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];
        isVisited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backtracking(0, 0);
    }

    public static void backtracking(int depth, int start) {
        StringBuilder sb = new StringBuilder();
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            String result = sb.toString();
            if (!set.contains(result)) {
                System.out.print(result);
                set.add(result);
            }
            return;
        }
        for (int i = start; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                result[depth] = arr[i];
                backtracking(depth + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }
}
