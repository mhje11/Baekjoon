package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_5_2303 {
    public static int N;
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxDigit = -1;
        int winner = 0;

        for (int person = 0; person < N; person++) {
            int maxLocal = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        int sum = arr[person][i] + arr[person][j] + arr[person][k];
                        int lastDigit = sum % 10;

                        maxLocal = Math.max(maxLocal, lastDigit);
                    }
                }
            }

            if (maxLocal >= maxDigit) {
                maxDigit = maxLocal;
                winner = person + 1;
            }
        }

        System.out.println(winner);
    }
}
