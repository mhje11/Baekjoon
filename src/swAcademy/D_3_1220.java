package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1220 {
    static int[][] arr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            Integer.parseInt(br.readLine());
            arr = new int[100][100];
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;
            for (int j = 0; j < 100; j++) {
                boolean foundN = false;
                for (int k = 0; k < 100; k++) {
                    if (arr[k][j] == 1) {
                        foundN = true;
                    } else if (arr[k][j] == 2 && foundN) {
                        count++;
                        foundN = false;
                    }
                }
            }
            sb.append("#").append(i).append(" ").append(count).append('\n');
        }
        System.out.println(sb);
    }



}
