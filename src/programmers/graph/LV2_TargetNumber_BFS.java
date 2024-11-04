package programmers.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class LV2_TargetNumber_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());

        int solution = solution(numbers, target);
        System.out.println(solution);


    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for (int i = 0; i < numbers.length; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int sum = queue.poll();
                queue.add(sum + numbers[i]);
                queue.add(sum - numbers[i]);
            }
        }

        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer++;
            }
        }

        return answer;
    }
}
