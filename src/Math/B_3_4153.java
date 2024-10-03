package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_3_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];

            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            Arrays.sort(sides);

            if ((sides[0] * sides[0] + sides[1] * sides[1]) == (sides[2] * sides[2])) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
