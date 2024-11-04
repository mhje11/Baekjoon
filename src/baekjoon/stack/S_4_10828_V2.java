package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_4_10828_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stack = new int[10000];

        int pos = -1;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.startsWith("push ")) {
                pos++;
                String[] s = command.split(" ");
                stack[pos] = Integer.parseInt(s[1]);
            }
            if (command.equals("pop")) {
                if (pos < 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[pos]);
                    pos--;
                }
            }
            if (command.equals("size")) {
                System.out.println(pos + 1);
            }
            if (command.equals("empty")) {
                if (pos < 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if (command.equals("top")) {
                if (pos < 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[pos]);
                }
            }
        }
    }

}
