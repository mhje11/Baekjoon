package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_2503 {
    public static int N;
    public static int[][] questions;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        questions = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            questions[i][0] = Integer.parseInt(st.nextToken());
            questions[i][1] = Integer.parseInt(st.nextToken());
            questions[i][2] = Integer.parseInt(st.nextToken());
        }
        System.out.println(answer());

    }

    public static int answer() {
        int count = 0;
        for (int i = 123; i <= 987; i++) {
            if (String.valueOf(i).contains("0")) {
                continue;
            } else if (hasDuplicate(i)) {
                continue;
            } else {
                if (baseball(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean hasDuplicate(int num) {
        String s = String.valueOf(num);
        return s.charAt(0) == s.charAt(1) ||
                s.charAt(1) == s.charAt(2) ||
                s.charAt(2) == s.charAt(0);
    }

    public static boolean baseball(int num) {
        String minhyeok = String.valueOf(num);
        for (int i = 0; i < N; i++) {
            int strike = 0;
            int ball = 0;
            String youngsoo = String.valueOf(questions[i][0]);

            for (int j = 0; j < 3; j++) {
                if (minhyeok.charAt(j) == youngsoo.charAt(j)) {
                    strike++;
                } else if (youngsoo.contains(String.valueOf(minhyeok.charAt(j)))) {
                    ball++;
                }
            }
            if (strike != questions[i][1] || ball != questions[i][2]) {
                return false;
            }
        }
        return true;
    }
}
