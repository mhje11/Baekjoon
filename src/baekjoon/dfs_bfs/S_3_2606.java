package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_3_2606 {
    static int N;
    static int M;
    static ArrayList<Integer>[] arr;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
//        dfs(1);
//        int count = 0;
//        for (int i = 2; i <= N ; i++) {
//            if (isVisited[i]) {
//                count++;
//            }
//        }
//        System.out.println(count);

        bfs(1);
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isVisited[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int index) {
        isVisited[index] = true;
        for (int i : arr[index]) {
            if (!isVisited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int index) {
        isVisited[index] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        while (!q.isEmpty()) {
            int a = q.poll();
            for(int i : arr[a]) {
                if (!isVisited[i]) {
                    q.add(i);
                    isVisited[i] = true;
                }
            }
        }
    }
}
