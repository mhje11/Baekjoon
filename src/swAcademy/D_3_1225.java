package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D_3_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();

            for (int j = 0; j < 8; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int count = 1;
            while (true) {
                Integer first = queue.poll();
                first -= count;
                count++;
                if (count > 5) {
                    count = 1;
                }
                if (first <= 0) {
                    first = 0;
                    queue.add(first);
                    break;
                }
                queue.add(first);
            }
            sb.append("#").append(i).append(" ");
            for (Integer integer : queue) {
                sb.append(integer).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
