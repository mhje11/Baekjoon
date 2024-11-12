package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_10505 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                arr[j] = a;
                sum += a;
            }
            double avg = sum / n;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] <= avg) {
                    count++;
                }
            }
            System.out.println("#" + i + " " + count);
        }
    }
}
