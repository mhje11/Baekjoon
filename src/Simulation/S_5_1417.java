package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class S_5_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int me = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        while (true) {
            Arrays.sort(arr, Collections.reverseOrder());
            if (N == 1 || arr[0] < me) {
                break;
            }
            else {
                ++me;
                --arr[0];
                ++count;
            }
        }
        System.out.println(count);

    }
}


