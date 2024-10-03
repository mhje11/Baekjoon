package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[3];
        arr[0] = true;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            swap(arr, X, Y);
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public static void swap(boolean[] arr, int X, int Y) {
        boolean temp;
        temp = arr[X - 1];
        arr[X - 1] = arr[Y - 1];
        arr[Y - 1] = temp;
    }
}
