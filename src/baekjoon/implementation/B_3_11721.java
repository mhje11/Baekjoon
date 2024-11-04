package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        int length = sentence.length();


            for (int i = 0; i < length; i += 10) {
                if (i + 10 < length) {
                    System.out.println(sentence.substring(i, i + 10));
                } else {
                    System.out.println(sentence.substring(i, length));
                }
            }
    }
}
