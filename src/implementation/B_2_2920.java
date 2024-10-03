package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_2920 {
    public static void main(String[] args) throws IOException {
        int[] a = new int[8];
        int count = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 8; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 7; i++) {
            if (Math.abs(a[i + 1] - a[i]) > 1) {
                count = -1;
                break;
            }
            if (a[i + 1] - a[i] == 1) {
                count++;
            }
        }

        if (count == -1) {
            System.out.println("mixed");
        } else if (count == 7) {
            System.out.println("ascending");
        } else {
            System.out.println("descending");
        }
    }
}
