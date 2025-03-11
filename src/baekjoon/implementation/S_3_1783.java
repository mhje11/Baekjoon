package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_1783 {
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int result;
        if (N == 1) {
            result = 1;
        } else if (N == 2) {
            result = Math.min((M + 1) / 2 , 4);
        } else if (M < 7) {
            result = Math.min(M, 4);
        } else {
            result = (M - 7) + 5;
        }

        System.out.println(result);
    }
}
