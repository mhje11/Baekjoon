package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_4_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        int maxWeight = 0;
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        for (int i = 0; i < n; i++) {
            int currentWeight = ropes[i] * (n - i);
            maxWeight = Math.max(maxWeight, currentWeight);
        }

        System.out.println(maxWeight);
    }
}
