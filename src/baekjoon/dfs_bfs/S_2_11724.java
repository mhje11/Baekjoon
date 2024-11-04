package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S_2_11724 {
    static int N;
    static int M;
    static ArrayList<Integer>[] arr;
    static boolean[] isVisit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        isVisit = new boolean[N + 1];
        arr = new ArrayList[N + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!isVisit[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);


    }

    public static void dfs(int index) {
        isVisit[index] = true;
        for (int i : arr[index]) {
            if (!isVisit[i]) {
                dfs(i);
            }
        }
    }

}
