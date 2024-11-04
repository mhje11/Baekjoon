package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//baekjoon.queue
public class S_4_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> card = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int lastNumber = 0;
        for (int i = 1; i <= N; i++) {
            card.offer(i);
        }
        while (!card.isEmpty()) {
            if (card.size() == 1) {
            lastNumber = card.peek();
            break;
        }
            card.poll();
            int back = card.poll();
            card.offer(back);

        }
        System.out.println(lastNumber);
    }
}
