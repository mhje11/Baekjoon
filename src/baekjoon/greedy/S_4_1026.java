package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//Sort, Greedy, Math
public class S_4_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] ArrA = new int[N];
        int[] ArrB = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i ++) {
            ArrA[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i ++) {
            ArrB[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(ArrA);
        Arrays.sort(ArrB);
        for (int i = 0; i < N; i++) {
            sum += ArrA[i] * ArrB[N - i - 1];
        }
        System.out.println(sum);
    }
}
