package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a - 1 < 0 && b < 45) {
            a = 23;
            b = 60 - (45 - b);
        } else if (b < 45) {
            a -= 1;
            b = 60 - (45 - b);
        } else {
            b -= 45;
        }

        System.out.println(a + " " + b);
    }
}
