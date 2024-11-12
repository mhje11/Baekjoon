package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_11688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            String s = br.readLine();
            int a = 1;
            int b = 1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'L') {
                    b = a + b;
                } else {
                    a = a + b;
                }
            }
            sb.append("#").append(i).append(" ").append(a).append(" ").append(b).append('\n');
        }
        System.out.println(sb);
    }
}
