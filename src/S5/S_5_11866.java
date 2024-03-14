package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 큐

public class S_5_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
            queue.offer(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int next = queue.poll();
                queue.offer(next);
            }
            if (queue.size() == 1) {
            int remove = queue.poll();
            sb.append(remove + ">");
            } else {int remove = queue.poll();
                sb.append(remove + ", ");
            }
            }
        System.out.println(sb);

        }
    }

