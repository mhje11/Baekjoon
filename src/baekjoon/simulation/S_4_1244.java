package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int switchNum = Integer.parseInt(br.readLine());
        int[] switchCondition = new int[switchNum];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < switchNum; i++) {
            switchCondition[i] = Integer.parseInt(st.nextToken());
        }
        int studentNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < studentNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (gender == 1) {
                for (int j = 1; j * num <= switchNum; j++) {
                switchCondition[j * num - 1] = 1 - switchCondition[j * num - 1];
                }
            }else {
                switchCondition[num - 1] = 1 - switchCondition[num - 1];
                int left = num - 2;
                int right = num;
                while (left >= 0 && right < switchNum && switchCondition[left] == switchCondition[right]) {
                    switchCondition[left] = 1 - switchCondition[left];
                    switchCondition[right] = 1 - switchCondition[right];
                    left--;
                    right++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < switchNum; i++) {
            sb.append(switchCondition[i] + " ");
            if ((i + 1) % 20 == 0) {
                sb.append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
