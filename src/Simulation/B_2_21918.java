package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] bulb = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int isLightOn = Integer.parseInt(st.nextToken());
            if (isLightOn == 1) {
                bulb[i] = true;
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 1) {
                if (c == 1) {
                    bulb[b - 1] = true;
                } else if (c == 0) {
                    bulb[b - 1] = false;
                }
            } else if (a == 2) {
                for (int k = b - 1; k < c; k++) {
                    bulb[k] = !bulb[k];
                }
            } else if (a == 3) {
                for (int k = b - 1; k < c; k++) {
                    bulb[k] = false;
                }

            } else if (a == 4) {
                for (int k = b - 1; k < c; k++) {
                    bulb[k] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (boolean b : bulb) {
            if (b) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}