package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//implementation, bruteForce

public class S_5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] people = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int count = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

    }
}
