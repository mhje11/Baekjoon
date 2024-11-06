package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2_1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            if (number.contains("3") ||number.contains("6") || number.contains("9")) {
                int count = 0;
                for (int j = 0; j < number.length(); j++) {
                    if (number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9') {
                        count++;
                    }
                }
                for (int j = 0; j < count; j++) {
                    sb.append("-");
                }
                sb.append(" ");
            } else {
                sb.append(number).append(" ");
            }

        }
        System.out.println(sb);
    }
}
