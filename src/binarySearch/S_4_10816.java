package binarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//binarySearch
//로직은 맞는데 시간 오래걸림, bw, br, sb로 시간줄여도 안됨, fail
public class S_4_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        int[] count = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Arrays.binarySearch(arr, arr2[j]) >= 0) {
                    if (arr2[j] == arr[i]) {
                        count[j]++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(count[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
