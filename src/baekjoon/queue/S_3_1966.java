package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_3_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int printOrder = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean hasHigherPriority = false;

                for (int[] doc : queue) {
                    if (doc[1] > current[1]) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.add(current);
                } else {
                    printOrder++;
                    if (current[0] == m) {
                        sb.append(printOrder).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
