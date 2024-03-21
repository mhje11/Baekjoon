package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_4_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st1.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
           if(Arrays.binarySearch(arr1, arr2[i]) >= 0) {
               sb.append("1" + '\n');
           } else {
               sb.append("0" + '\n');
           }
        }
        System.out.println(sb.toString().trim());
    }
}
