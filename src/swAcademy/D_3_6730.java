package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int down = 0;
            int up = 0;
            int current = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n - 1; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (current < a) {
                    up = Math.max(up, a - current);
                    current = a;
                } else if (current > a){
                    down = Math.max(down, current - a);
                    current = a;
                } else {

                }
            }
            System.out.println("#" + i + " " + up + " " + down);
        }
    }
}
