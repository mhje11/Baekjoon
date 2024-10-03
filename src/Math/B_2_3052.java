package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B_2_3052 {
    public static void main(String[] args) throws IOException {
        Set remainder = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            remainder.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(remainder.size());
    }
}
