package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < num; j++) {
                    sb.append(str.charAt(i));
                }
            }
            sb.append('\n');
            T--;
        }
        System.out.println(sb);
    }
}
