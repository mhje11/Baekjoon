package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_5_1914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow(2, n) - 1);
        if (n <= 20) {
            hanoi(n, 1, 3, 2);
        }

    }

    public static void hanoi(int n, int from, int to, int via) {
        if(n == 1) {
            System.out.println(from + " " + to);
            return;
        }

        hanoi(n - 1, from, via, to);

        System.out.println(from + " " + to);

        hanoi(n - 1, via, to, from);
    }
}
