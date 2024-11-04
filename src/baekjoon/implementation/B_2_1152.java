package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_1152 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean wordStart = false;
        String line = br.readLine().trim();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (wordStart) {
                    count++;
                    wordStart = false;
                }
            } else {
                wordStart = true;
            }
        }
        if (wordStart) {
            count++;
        }
        System.out.println(count);
    }
}
