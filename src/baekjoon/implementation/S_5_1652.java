package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1652 {
    public static int N;
    public static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        System.out.print(width() + " " + height());


    }


    public static int width() {
        int count = 0;

        for (int i = 0; i < N; i++) {
            int space = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == '.') {
                    space++;
                } else {
                    if (space >= 2) {
                        count++;
                    }
                    space = 0;
                }
            }
            if (space >= 2) {
                count++;
            }
        }
        return count;
    }

    public static int height() {
        int count = 0;

        for (int i = 0; i < N; i++) {
            int space = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == '.') {
                    space++;
                } else {
                    if (space >= 2) {
                        count++;
                    }
                    space = 0;
                }
            }
            if (space >= 2) {
                count++;
            }
        }
        return count;
    }
}
