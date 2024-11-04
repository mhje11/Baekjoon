package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int system = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (num >= 1) {
            if (num % system >= 10) {
                char c = (char) (num % system);
                c = (char) (c - 10 + 'A');
                sb.append(c);
            } else {
                sb.append(num % system);
            }

            num /= system;
        }
        System.out.println(sb.reverse());
    }
}
