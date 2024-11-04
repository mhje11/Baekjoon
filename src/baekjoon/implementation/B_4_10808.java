package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(s.charAt(i) == 97 + j) {
                    alphabet[j]++;
                }
            }
        }
        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
