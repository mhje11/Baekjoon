package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_2_2644 {
    public static int n;
    public static List<Integer>[] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int person1 = Integer.parseInt(st.nextToken());
        int person2 = Integer.parseInt(st.nextToken());

        int relationNum = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < relationNum; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());

            graph[parent].add(child);
            graph[child].add(parent);
        }
        int result = bfs(person1, person2);
        System.out.println(result);


    }

    public static int bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[n + 1];

        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int person = cur[0];
            int count = cur[1];

            if (person == target) {
                return count;
            }

            for (int next : graph[person]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, count + 1});
                }

            }
        }
        return -1;
    }
}
