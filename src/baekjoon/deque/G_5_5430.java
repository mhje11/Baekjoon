package baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class G_5_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            boolean possible = true;
            boolean reverse = false;
            Deque<Integer> deque = new ArrayDeque<>();

            if (n > 0) {
                String[] split = arr.substring(1, arr.length() - 1).split(",");
                for (String string : split) {
                    deque.addLast(Integer.parseInt(string.trim()));
                }
            }

            for (char cmd : s.toCharArray()) {
                if (cmd == 'R') {
                    reverse = !reverse;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        possible = false;
                        break;
                    }
                    if (reverse) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }
            if (!possible) {
                sb.append("error").append('\n');
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(reverse ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]").append('\n');

            }

        }

        System.out.println(sb);
    }
}
