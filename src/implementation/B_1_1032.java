package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_1032 {
    //charAt(i)는 인덱스를 꺼내오기만 가능하니까 StringBuilder 로 조작
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder pattern = sb.append(s);

        for (int i = 0; i < n - 1; i++) {
            String input = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (input.charAt(j) != pattern.charAt(j)) {
                    pattern.setCharAt(j, '?');
                }
            }

        }
        System.out.println(pattern);

    }
}
