package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class S_5_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = yearCheck(E, S, M);
        System.out.println(result);

    }

    public static int yearCheck(int E, int S, int M) {
        int count = 1;
        int e = 1;
        int s = 1;
        int m = 1;
        while (true) {
            if (E == e && S == s && M == m) {
                return count;
            }
            e += 1;
            s += 1;
            m += 1;
            count++;
            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }
        }
    }
}
