package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_5_1914_ex2 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(n, 1, 3, 2);
        System.out.println((int)Math.pow(2, n) - 1);
        System.out.println(sb);

    }

    public static void recursion(int n, int from, int to, int via) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append('\n');
            return;
        }
        recursion(n - 1, from, via, to);
        sb.append(from).append(" ").append(to).append('\n');
        recursion(n - 1, via, to, from);
    }
}
