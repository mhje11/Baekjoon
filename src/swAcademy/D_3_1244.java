package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int change = Integer.parseInt(st.nextToken());

            int[] numbers = new int[s.length()];
            for (int j = 0; j < s.length(); j++) {
                numbers[j] = s.charAt(j) - '0';
            }


        }
    }
}
