package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_1_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());

        while (c-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int sum = 0;
            int count = 0;
            List<Integer> scoreList = new ArrayList<>();
            for (int i = 0; i < students; i++) {
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                scoreList.add(score);
            }
            BigDecimal avg = BigDecimal.valueOf((double) sum / students);
            for (Integer i : scoreList) {
                if (BigDecimal.valueOf(i).compareTo(avg) > 0) {
                    count++;
                }
            }
            BigDecimal totalStudents = BigDecimal.valueOf(students);
            BigDecimal ratio = BigDecimal.valueOf(count).divide(totalStudents, 10, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));

            ratio = ratio.setScale(3, RoundingMode.HALF_UP);
            sb.append(ratio).append("%\n");
        }
        System.out.println(sb.toString().trim());
    }
}
