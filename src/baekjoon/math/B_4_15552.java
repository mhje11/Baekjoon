package baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

public class B_4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(b + c));
            bw.newLine();
        }
        bw.flush();
    }
}
