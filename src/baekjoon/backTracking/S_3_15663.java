package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S_3_15663 {
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

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        result = new int[M];
        isVisited = new boolean[N];
        backtracking(0);
    }

    public static void backtracking(int depth) {
        StringBuilder sb = new StringBuilder();
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append('\n');
            String result = sb.toString();
            if (!set.contains(result)) {
                System.out.print(result);
                set.add(result);
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (isVisited[i]) {
                continue;
            }
            result[depth] = arr[i];
            isVisited[i] = true;
            backtracking(depth + 1);
            isVisited[i] = false;

        }
    }
}
