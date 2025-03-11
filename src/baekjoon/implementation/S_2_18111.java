package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_18111 {
    public static int N;
    public static int M;
    public static int B;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, arr[i][j]);
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int bestHeight = -1;

        for (int h = minHeight; h <= maxHeight; h++) {
            int time = 0;
            int blocks_needed = 0;
            int blocks_removed = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = arr[i][j] - h;
                    if (diff > 0) {
                        blocks_removed += diff;
                    } else if (diff < 0) {
                        blocks_needed -= diff;
                    }
                }
            }

            if (blocks_removed + B >= blocks_needed) {
                time = (blocks_removed * 2) + blocks_needed;

                if (time < minTime || (time == minTime && h > bestHeight)) {
                    minTime = time;
                    bestHeight = h;
                }
            }
        }

        System.out.println(minTime + " " + bestHeight);

    }

}
