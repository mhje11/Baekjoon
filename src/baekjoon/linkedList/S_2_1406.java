package baekjoon.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_1406 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        sb.append(s);
        int m = Integer.parseInt(br.readLine());

        int current = s.length();

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            if (command.equals("L")) {
                if (current == 0) {
                    continue;
                }
                current--;
            } else if (command.equals("D")) {
                if (current < sb.length()) {
                    current++;
                }
            } else if (command.equals("B")) {
                if (current == 0) {
                    continue;
                }
                sb.deleteCharAt(current - 1);
                current--;
            } else if (command.startsWith("P")) {
                String[] s1 = command.split(" ");
                sb.insert(current, s1[1].charAt(0));
                current++;
            }
        }
        System.out.println(sb);

    }
}
