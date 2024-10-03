package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int current = m;
        int count = 0;

        while (N > 0) {
            if (m + T > M) {
                count = -1;
                break;
            }
            if (current + T <= M) {
                current += T;
                N--;
                count++;
            } else if(current + T > M) {
                if (current - R < m) {
                    current = m;
                    count++;
                } else {
                    current -= R;
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
