package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1_2947 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        int[] copyArr = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);

        while (true) {
            for (int i = 0; i < 4; i++) {
                int temp = 0;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                } else {
                    continue;
                }
                for (int i1 : arr) {
                    sb.append(i1).append(" ");
                }
                System.out.println(sb);
                sb.delete(0, sb.length());
            }
            if (Arrays.equals(copyArr, arr)) {
                break;
            }
        }


    }
}
