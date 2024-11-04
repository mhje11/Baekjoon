package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G_5_1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(recursion(n, r, c));
    }

    public static int recursion(int n, int r, int c) {
        int half = 1 << (n - 1);
        if (n == 0) {
            return 0;
        }
        if (r < half && c < half) {
            return  recursion(n - 1, r, c);
        }
        if (r < half && c >= half) {
            return half * half + recursion(n - 1, r, c - half);
        }
        if (r >= half && c < half) {
            return 2 * half * half + recursion(n - 1, r - half, c);
        }
        return 3 * half * half + recursion(n - 1, r - half, c - half);
    }
}
