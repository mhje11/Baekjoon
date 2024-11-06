package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_2_1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            List<double[]> list = new ArrayList<>();

            for (int j = 1; j <= student; j++) {
                st = new StringTokenizer(br.readLine());
                double a = Double.parseDouble(st.nextToken());
                double b = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());
                double grade = (a * 0.35) + (b * 0.45) + (c * 0.20);
                list.add(new double[]{j, grade});
            }

            Collections.sort(list, new Comparator<double[]>() {
                @Override
                public int compare(double[] o1, double[] o2) {
                    return Double.compare(o2[1], o1[1]);
                }
            });


            int rank = 0;
            for (int j = 0; j < student; j++) {
                if ((int) list.get(j)[0] == number) {
                    rank = j;
                    break;
                }
            }
            int gradeIndex = rank / (student / 10);
            sb.append("#").append(i).append(" ").append(grades[gradeIndex]).append("\n");
        }
        System.out.println(sb);
    }
}
