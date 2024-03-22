package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//implementation

public class S_5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(sets(N));

    }
    public static int sets(int N) {
        int[] count = new int[10];
        while (N > 0) {
            count[N % 10]++;
            N /= 10;
        }
        int maxSets = 0;
        int sixNine = count[6] + count[9];
        if(sixNine % 2 == 0) {
            count[6] = sixNine / 2;
        } else {
            count[6] = sixNine / 2 + 1;
        }
        if(sixNine % 2 == 0) {
            count[9] = sixNine / 2;
        } else {
            count[9] = sixNine / 2 + 1;
        }

        for (int i = 0; i < 10; i++) {
            maxSets = Math.max(maxSets, count[i]);
        }
        return maxSets;
    }
}

