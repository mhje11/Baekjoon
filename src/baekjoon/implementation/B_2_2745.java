package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        double sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(num.length() - i - 1);
            int value = 0;
            if (Character.isDigit(c)) {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            sum += value * Math.pow(base, i);
        }

        System.out.println((int) sum);
    }
}
