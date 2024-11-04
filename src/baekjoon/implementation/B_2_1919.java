package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                if (freq[i] < 0) {
                    count += -1 * (freq[i]);
                } else {
                    count += freq[i];
                }

            }
        }

        System.out.println(count);
    }
}
