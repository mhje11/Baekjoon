package baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_4_10866_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 10000;
        int[] deque = new int[2 * max + 1];
        int head = max;
        int tail = max;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.startsWith("push_front ")) {
                String[] s = command.split(" ");
                deque[--head] = Integer.parseInt(s[1]);
            }
            if (command.startsWith("push_back ")) {
                String[] s = command.split(" ");
                deque[tail++] = Integer.parseInt(s[1]);
            }

            if (command.equals("pop_front")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque[head++]);
                }
            }
            if (command.equals("pop_back")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque[--tail]);
                }
            }
            if (command.equals("size")) {
                System.out.println(tail - head);
            }
            if (command.equals("empty")) {
                if (head == tail) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            if (command.equals("front")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque[head]);
                }
            }
            if (command.equals("back")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque[tail - 1]);
                }
            }
        }

    }
}
