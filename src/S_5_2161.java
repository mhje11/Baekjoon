import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S_5_2161 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = i + 1;
            queue.offer(cards[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            int throwsCard = queue.poll();
            sb.append(throwsCard + " ");
            if (!queue.isEmpty()) {
                int nextCard = queue.poll();
                queue.offer(nextCard);
            }

        }
        System.out.println(sb);

    }
}
