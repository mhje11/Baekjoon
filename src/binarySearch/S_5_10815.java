package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//BinarySearch

public class S_5_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (binarySearch(cards, target)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);

    }

    public static boolean binarySearch(int[] cards, int target) {
        int low = 0;
        int high = cards.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (cards[mid] == target) {
                return true;
            } else if (cards[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }

        }
        return false;
    }

}
