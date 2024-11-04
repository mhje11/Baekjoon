package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1_14888 {
    static int N;
    static int[] arr;
   static int maxResult = Integer.MIN_VALUE;
   static int minResult = Integer.MAX_VALUE;
    // +, -, *, /
    static int[] operator = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(arr[0], 1);
        System.out.println(maxResult);
        System.out.println(minResult);

    }

    public static void backtracking(int currentResult, int depth) {
        if (depth == N) {
            maxResult = Math.max(maxResult, currentResult);
            minResult = Math.min(minResult, currentResult);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                int nextResult = currentResult;

                if (i == 0) {
                    nextResult += arr[depth];
                } else if (i == 1) {
                    nextResult -= arr[depth];
                } else if (i == 2) {
                    nextResult *= arr[depth];
                } else if (i == 3) {
                    if (currentResult < 0) {
                        nextResult = -(-currentResult /arr[depth]);
                    } else {
                        nextResult /= arr[depth];
                    }
                }

                backtracking(nextResult, depth + 1);
                operator[i]++;
            }
        }
    }

}
