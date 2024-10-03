package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[100];
        int start, end, max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            min = Math.min(min, start);
            max = Math.max(max, end);
            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }
        for (int i = min; i < max; i++) {
            switch (arr[i]) {
                case 1:
                    sum = sum + A * arr[i];
                    break;
                case 2:
                    sum = sum + B * arr[i];
                    break;
                case 3:
                    sum = sum + C * arr[i];
                    break;
            }
        }
        System.out.println(sum);


    }
}
