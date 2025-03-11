package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int length = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                length++;
            } else {
                if (!convert(sb, length)) {
                    System.out.println("-1");
                    return;
                }
                sb.append('.');
                length = 0;
            }
        }

        if (!convert(sb, length)){
            System.out.println("-1");
            return;
        }
        System.out.println(sb);
    }

    public static boolean convert(StringBuilder sb, int length) {
        if (length % 2 != 0) {
            return false;
        }

        int fourCount = length / 4;
        int twoCount = (length % 4) / 2;

        sb.append("AAAA".repeat(fourCount));
        sb.append("BB".repeat(twoCount));

        return true;
    }
}
