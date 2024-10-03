package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_10840 {
    public static void main(String[] args) throws IOException {
        int[] card = new int[20];
        for (int i = 0; i < card.length; i++) {
            card[i] = i + 1;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            swap(card, a, b);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < card.length; i++) {
            sb.append(card[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] card, int a, int b) {
        int temp;
        while (a < b) {
            temp = card[a - 1];
            card[a - 1] = card[b - 1];
            card[b - 1] = temp;
            a++;
            b--;
        }
    }
}
