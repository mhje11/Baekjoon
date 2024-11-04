package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String s2 = st.nextToken();

            if (s.length() != s2.length()) {
                sb.append("Impossible").append('\n');
                continue;
            }

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            for (char c : s2.toCharArray()) {
                freq[c - 'a']--;
            }
            boolean possible = true;
            for (int count : freq) {
                if (count != 0) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                sb.append("Possible").append('\n');
            } else {
                sb.append("Impossible").append('\n');
            }
        }
        System.out.println(sb);


    }
}
