package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    count++;
                }
            }
            switch (count) {
                case 0 :
                    sb.append("E").append('\n');
                    break;
                case 1:
                    sb.append("A").append('\n');
                    break;
                case 2:
                    sb.append("B").append('\n');
                    break;
                case 3:
                    sb.append("C").append('\n');
                    break;
                case 4:
                    sb.append("D").append('\n');
                    break;
            }
        }
        System.out.println(sb.toString().trim());
    }
}
