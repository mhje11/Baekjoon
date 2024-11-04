package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1_1697 {
    static int N, K;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        isVisited = new boolean[100001];

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N));
    }

    public static int bfs(int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, 0});
        isVisited[x] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPosition = current[0];
            int currentTime = current[1];

            if (currentPosition == K) {
                return currentTime;
            }

            int[] nextPositions = {currentPosition - 1, currentPosition + 1, currentPosition * 2};
            for (int nextPos : nextPositions) {
                if (nextPos >= 0 && nextPos <= 100000 && !isVisited[nextPos]) {
                    isVisited[nextPos] = true;
                    queue.offer(new int[] {nextPos, currentTime + 1});
                }
            }
        }
        return -1;
    }
}
