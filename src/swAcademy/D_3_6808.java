package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_6808 {
    static int winCount;
    static int loseCount;
    static List<Integer> gyuCards = new ArrayList<>();
    static List<Integer> inCards = new ArrayList<>();
    static boolean[] used = new boolean[9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            winCount = 0;
            loseCount = 0;
            gyuCards.clear();
            inCards.clear();

            boolean[] allCards = new boolean[19];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int card = Integer.parseInt(st.nextToken());
                gyuCards.add(card);
                allCards[card] = true;
            }

            for (int j = 1; j <= 18; j++) {
                if (!allCards[j]) {
                    inCards.add(j);
                }
            }
            dfs(0, 0, 0);
            sb.append("#").append(i).append(" ").append(winCount). append(" ").append(loseCount).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int round, int gyuScore, int inScore) {
        if (round == 9) {
            if (gyuScore > inScore) {
                winCount++;
            } else if (gyuScore < inScore) {
                loseCount++;
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!used[i]) {
                used[i] = true;

                int gyuCard = gyuCards.get(round);
                int inCard = inCards.get(i);

                if (gyuCard > inCard) {
                    dfs(round + 1, gyuScore + gyuCard + inCard, inScore);
                } else {
                    dfs(round + 1, gyuScore, inScore + gyuCard + inCard);
                }

                used[i] = false;
            }
        }
    }
}
