package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        String[] subtractions = expression.split("\\-");
        int result = 0;


        String[] firstAdd = subtractions[0].split("\\+");
        for (String s : firstAdd) {
            result += Integer.parseInt(s);
        }

        for (int i = 1; i < subtractions.length; i++) {
            String[] add = subtractions[i].split("\\+");
            int subResult = 0;
            for (String s : add) {
                subResult += Integer.parseInt(s);
            }
            result -= subResult;
        }

        System.out.println(result);

    }
}
