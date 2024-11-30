package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_2817 {
    static int N;
    static int K;
    static int[] arr;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            count = 0;
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            backtracking(0, 0);

            sb.append("#").append(i).append(" ").append(count).append('\n');
        }
        System.out.println(sb);
    }

    public static void backtracking(int index, int currentSum) {
        if (currentSum == K) {
            count++;
            return;
        }
        if (currentSum > K || index == N) {
            return;
        }

        //현재 인덱스 포함
        backtracking(index + 1, currentSum + arr[index]);

        //현재 인덱스 포함 x
        backtracking(index + 1, currentSum);
    }
}
