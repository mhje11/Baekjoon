package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            Integer.parseInt(br.readLine());
            String s = br.readLine();
            String sentence = br.readLine();
            int count = 0;

            for (int j = 0; j <= sentence.length() - s.length(); j++) {
                StringBuilder part = new StringBuilder();
                for (int k = 0; k < s.length(); k++) {
                    part.append(sentence.charAt(j + k));
                }
                if (s.equals(part.toString())) {
                    count++;
                }
            }
            sb.append("#").append(i).append(" ").append(count).append('\n');
        }
        System.out.println(sb);
    }
}
