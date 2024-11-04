package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//dp
public class S_5_16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (n == 0 || k == 0) {
            System.out.println("0");
        } else if (n == 1 || k == 1){
            System.out.println("1");
        }else {

            int[][] pascal = new int[n][];
            for (int i = 0; i < n; i++) {
                pascal[i] = new int[n + 1];
            }
            pascal[0][0] = 1;
            pascal[1][0] = 1;
            pascal[1][1] = 1;
            for (int i = 0; i < n; i++) {
                pascal[i][0] = 1;
                pascal[i][i] = 1;
            }
            for (int i = 2; i < n; i++) {
                for (int j = 1; j < i; j++) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
            System.out.println(pascal[n - 1][k - 1]);
        }
    }
}
