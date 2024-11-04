package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S_1_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = Math.abs(o1);
                int b = Math.abs(o2);

                if (a == b) {
                    return o1 - o2;
                } else {
                    return a - b;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (queue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else {
                queue.add(num);
            }
        }
        System.out.println(sb);
    }
}
