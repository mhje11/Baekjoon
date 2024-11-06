package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G_5_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
//            d = y - x를 계산합니다.
//                    d의 제곱근을 구하여 n을 찾습니다 (n = sqrt(d)).
//                    d가 n^2과 (n+1)^2 사이에 있으면:
//            d <= n^2 + n인 경우, 최소 이동 횟수는 2n.
//                    d > n^2 + n인 경우, 최소 이동 횟수는 2n + 1.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            long distance = y - x;
            long n = (long) Math.sqrt(distance);

            if (n * n == distance) {
                System.out.println(2 * n - 1);
            } else {
                System.out.println(2 * n + 1);
            }

        }
    }
}
