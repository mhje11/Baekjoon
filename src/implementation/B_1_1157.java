package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_1_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        char alphabet = '?';

        int max = 0;

        int [] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                alphabet = (char) (i + 65);
            } else if (count[i] == max) {
                alphabet = '?';
            }
        }
        System.out.println(alphabet);
    }
}
