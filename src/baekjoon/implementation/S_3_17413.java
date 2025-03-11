package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class S_3_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        boolean inTag = false;

        for (char c : s.toCharArray()) {
            if (c == '<') {
                result.append(sb.reverse());
                sb.setLength(0);
                inTag = true;
                result.append(c);
            } else if (c == '>') {
                inTag = false;
                result.append(c);
            } else if (inTag) {
                result.append(c);
            } else {
                if (c == ' ') {
                    result.append(sb.reverse());
                    sb.setLength(0);
                    result.append(' ');
                } else {
                    sb.append(c);
                }
            }
        }

        result.append(sb.reverse());
        System.out.println(result);
    }
}
