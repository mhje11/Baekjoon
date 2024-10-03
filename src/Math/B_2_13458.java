package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] people = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long supervisor = 0;

        for (int i = 0; i < n; i++) {
            people[i] -= b;
            supervisor++;
            if (people[i] > 0) {
                if (people[i] % c == 0) {
                    supervisor += people[i] / c;
                } else {
                    supervisor += people[i] /c + 1;
                }
            }
        }
        System.out.println(supervisor);
    }
}
