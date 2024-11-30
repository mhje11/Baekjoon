package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_3499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<String> front = new ArrayList<>();
            List<String> back = new ArrayList<>();
            List<String> shuffle = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("#").append(i).append(" ");
            if (n % 2 == 0) {
                for (int j = 0; j < n / 2; j++) {
                    front.add(st.nextToken());
                }
                for (int j = 0; j < n / 2; j++) {
                    back.add(st.nextToken());
                }
                for (int j = 0; j < n / 2; j++) {
                    shuffle.add(front.get(j));
                    shuffle.add(back.get(j));
                }
                for (String s : shuffle) {
                    sb.append(s).append(" ");
                }
            } else { //0 1 2 3 4
                for (int j = 0; j < n / 2; j++) {
                    front.add(st.nextToken());
                }
                String mid = st.nextToken();
                for (int j = 0; j < n / 2; j++) {
                    back.add(st.nextToken());
                }
                for (int j = 0; j < n / 2; j++) {
                    shuffle.add(front.get(j));
                    shuffle.add(back.get(j));
                }
                shuffle.add(mid);
                for (String s : shuffle) {
                    sb.append(s).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
