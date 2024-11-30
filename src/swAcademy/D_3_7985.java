package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_7985 {
    static List<List<Integer>> binary;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numNodes = (int) Math.pow(2, k) - 1;
            int[] arr = new int[numNodes];
            for (int j = 0; j < numNodes; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.print("#" + i + " ");
            while (k > 0) {
                for (int j = (int) Math.pow(2, k - 1) - 1; j < numNodes; j += Math.pow(2, k)) {
                    System.out.print(arr[j] + " ");
                }
                k--;
                System.out.println();
            }
        }
    }
}
