package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] temperature = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            temperature[i] = Integer.parseInt(st.nextToken());
        }

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += temperature[i];
        }
        int max = currentSum;

        for (int i = k; i < n; i++) {
            currentSum += temperature[i] - temperature[i - k];
            max = Math.max(max, currentSum);
        }

        System.out.println(max);
    }
}
