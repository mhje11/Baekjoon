package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_5_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double totalScore = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }
            totalScore += score;

            switch (grade) {
                case "A+":
                    sum += 4.5 * score;
                    break;
                case "A0":
                    sum += 4.0 * score;
                    break;
                case "B+":
                    sum += 3.5 * score;
                    break;
                case "B0":
                    sum += 3.0 * score;
                    break;
                case "C+":
                    sum += 2.5 * score;
                    break;
                case "C0":
                    sum += 2.0 * score;
                    break;
                case "D+":
                    sum += 1.5 * score;
                    break;
                case "D0":
                    sum += 1.0 * score;
                    break;
                case "F":
                    sum += 0.0 * score;
                    break;

            }
        }
        System.out.printf("%.6f%n", sum / totalScore);
    }
}
