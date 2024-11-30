package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_1230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                list.add(st.nextToken());
            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String command = st.nextToken();
                if (command.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        list.add(x - 1 + j, st.nextToken());
                    }
                } else if (command.equals("D")) {
                    int x = Integer.parseInt(br.readLine());
                    int y = Integer.parseInt(br.readLine());
                    for (int j = 0; j < y; j++) {
                        list.remove(x);
                    }
                } else if (command.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());
                    int s = Integer.parseInt(st.nextToken());
                    StringBuilder pwd = new StringBuilder(list.get(list.size() - 1));
                    for (int j = 0; j < y; j++) {
                        pwd.append(st.nextToken());
                    }
                    list.set(list.size() - 1, pwd.toString());
                }
            }
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < 10; j++) {
                sb.append(list.get(j)).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
