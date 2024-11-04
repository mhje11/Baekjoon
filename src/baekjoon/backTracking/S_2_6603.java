package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_6603 {
    static int num;
    static int[] arr;
    static int[] result;
    static boolean[] isVisit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                break;
            }
            arr = new int[num];
            isVisit = new boolean[num];
            result = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            backtracking(0, 0);
            System.out.println();
        }
    }

    public static void backtracking(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < num; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                result[depth] = arr[i];
                backtracking(depth + 1, i + 1);
                isVisit[i] = false;
            }
        }

    }
}
