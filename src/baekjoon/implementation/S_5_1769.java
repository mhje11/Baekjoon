package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();
        int count = 0;

        while (x.length() > 1) {
            x = addDigit(x);
            count++;
        }
        System.out.println(count);
        if (Integer.parseInt(x) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    public static String addDigit(String num) {
        int result = 0;
        for (char c : num.toCharArray()) {
            result += c - '0';
        }
        return String.valueOf(result);
    }
}
