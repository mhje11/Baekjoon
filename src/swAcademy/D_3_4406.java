package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_4406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            String s = br.readLine();
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
