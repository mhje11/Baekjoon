package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count0 = 0;
        int count1 = 0;
        char current;
        if (s.charAt(0) == '0') {
            count0++;
            current = s.charAt(0);
        } else {
            count1++;
            current = s.charAt(0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (current != s.charAt(i)) {
                current = s.charAt(i);
                if (current == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }
        System.out.println(Math.min(count0, count1));
    }
}
