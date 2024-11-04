package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G_5_2170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<int[]> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            lines.add(new int[]{x, y});
        }

        Collections.sort(lines, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int currentX = lines.get(0)[0];
        int currentY = lines.get(0)[1];
        int result = 0;

        for (int i = 1; i < n; i++) {
            int[] line = lines.get(i);
            int x = line[0];
            int y = line[1];

            if (x <= currentY) {
                currentY = Math.max(currentY, y);
            } else {
                result += currentY - currentX;
                currentX = x;
                currentY = y;
            }
        }

        result += currentY - currentX;
        System.out.println(result);


    }
}
