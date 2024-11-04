package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//baekjoon.implementation

public class S_5_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int total = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int k = x; k < x + 10; k++) {
                for (int j = y; j < y + 10; j++) {
                    paper[k][j] = true;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    total++;
                }
            }
        }
        System.out.println(total);
        }

    }

