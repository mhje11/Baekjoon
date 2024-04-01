package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_5_10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        String[][] arr = new String[H][W];
        int[][] arr2 = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = br.readLine();
            for (int j = 0; j < W; j++) {
                arr[i][j] = line.charAt(j) + "";
            }
        }
        for (int i = 0; i < H; i++) {
            int cloudDistance = -1;
            for (int j = 0; j < W; j++) {
                if (arr[i][j].equals("c")) {
                    cloudDistance = 0;
                } else if (cloudDistance != -1) {
                    cloudDistance++;
                }
                arr2[i][j] = cloudDistance;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                sb.append(arr2[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb.toString().trim());



    }
}
