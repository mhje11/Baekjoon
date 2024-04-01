package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if(isDivisor(N, i)) {
                count++;
            }
            if (count == K) {
                System.out.println(i);
                break;
            }
        }
        if (K > count) {
            System.out.println(0);
        }


    }

    public static boolean isDivisor(int N, int i) {
        if (N % i == 0) {
            return true;
        }
        return false;
    }

}



