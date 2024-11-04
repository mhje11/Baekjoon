package baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S_3_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            int index = 0;
            for (Integer num : deque) {
                if (num == target) {
                    break;
                }
                index++;
            }

            if (index <= deque.size() / 2) {
                while (deque.peekFirst() != target) {
                    deque.addLast(deque.pollFirst());
                    sum++;
                }
            } else {
                while (deque.peekFirst() != target) {
                    deque.addFirst(deque.pollLast());
                    sum++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(sum);

    }
}
