package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String bestWord = "z".repeat(word.length());
        int length = word.length();

        for (int i = 1; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                String part1 = new StringBuilder(word.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(word.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(word.substring(j)).reverse().toString();

                String newWord = part1 + part2 + part3;
                if (newWord.compareTo(bestWord) < 0) {
                    bestWord = newWord;
                }
            }
        }
        System.out.println(bestWord);
    }
}
