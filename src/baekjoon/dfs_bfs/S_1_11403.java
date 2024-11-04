package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_1_11403 {
    static int N;
    static boolean[] isVisit;
    static ArrayList<Integer>[] arr;
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N];

        result = new int[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) {
                    arr[i].add(j);
                }
            }
        }

//        for (int i = 0; i < N; i++) {
//            isVisit = new boolean[N];
//            dfs(i);
//            for (int j = 0; j < N; j++) {
//                if (isVisit[j]) {
//                    result[i][j] = 1;
//                }
//            }
//        }
        for (int i = 0; i < N; i++) {
            isVisit = new boolean[N];
            bfs(i);
            for (int j = 0; j < N; j++) {
                if (isVisit[j]) {
                    result[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.add(start);
        isVisit[start] = true;
        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            for (Integer i : arr[current]) {
                if (!isVisit[i]) {
                    isVisit[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        isVisit[start] = true;
        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            for (Integer i : arr[current]) {
                if (!isVisit[i]) {
                    isVisit[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

}
