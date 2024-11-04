package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_2_11725 {
    static ArrayList<Integer>[] arr;
    static int N;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N + 1];
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        bfs(1);
//        dfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }


    }

    public static void bfs(int rootNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(rootNode);
        parent[rootNode] = 0;
        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            for (Integer next : arr[current]) {
                if (parent[next] == 0) {
                    parent[next] = current;
                    queue.offer(next);
                }
            }
        }
    }

    public static void dfs(int rootNode) {
        Stack<Integer> stack = new Stack<>();
        stack.add(rootNode);
        parent[rootNode] = 0;
        while (!stack.isEmpty()) {
            Integer current = stack.pop();

            for (Integer next : arr[current]) {
                if (parent[next] == 0) {
                    parent[next] = current;
                    stack.push(next);
                }
            }
        }
    }

}
