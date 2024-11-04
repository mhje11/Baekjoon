package programmers.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LV_2_TargetNumber_DFS {
    static int answer = 0;
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
        dfs(0, numbers, target, 0);
        return answer;
    }

    public static void dfs(int depth, int[] numbers, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, numbers, target, sum + numbers[depth]);
        dfs(depth + 1, numbers, target, sum - numbers[depth]);
    }
}
