package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class D_3_8888 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            //문제 갯수
            int t = Integer.parseInt(st.nextToken());
            //지석이번호
            int p = Integer.parseInt(st.nextToken());

            Map<Integer, int[]> numberAndSolve = new HashMap<>();
            int[] score = new int[t + 1];

            for (int j = 1; j <= n; j++) {
                st = new StringTokenizer(br.readLine());
                int[] solve = new int[t + 1];
                for (int k = 1; k <= t; k++) {
                    int isSolve = Integer.parseInt(st.nextToken());
                    if (isSolve == 0) {
                        score[k]++;
                    }
                    solve[k] = isSolve;
                }
                numberAndSolve.put(j, solve);
            }

            int[] solved = numberAndSolve.get(p);
            int jsScore = 0;
            for (int j = 1; j <= t + 1; j++) {
                jsScore += score[j] * solved[j];
            }


        }
    }
}
