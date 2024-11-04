package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//baekjoon.implementation, fail

public class S_5_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int line = 1;
        int count = 0;
        while (count + line < X) {
            count += line++;
        }
        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = X - count;
            denominator = line - (X - count) + 1;
        } else {
            numerator = line - (X - count) + 1;
            denominator = X - count;
        }
        System.out.println(numerator + "/" + denominator);
    }
}
