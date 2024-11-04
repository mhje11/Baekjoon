package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_4_10845_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] queue = new int[10000];

        int tail = 0;
        int head = 0;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.startsWith("push ")) {
                String[] s = command.split(" ");
                queue[tail] = Integer.parseInt(s[1]);
                tail++;
            }
            if (command.equals("pop")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[head]);
                    head++;
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
                    System.out.println(queue[head]);
                }
            }
            if (command.equals("back")) {
                if (head == tail) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[tail - 1]);
                }
            }
        }
    }
}
