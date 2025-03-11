package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_2852 {
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int team1Score = 0;
        int team2Score = 0;
        int team1Time = 0;
        int team2Time = 0;
        int prevTime = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(st.nextToken());
            String[] timeParts = st.nextToken().split(":");
            int currentTime = Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);
            if (team1Score > team2Score) {
                team1Time += (currentTime - prevTime);
            } else if (team2Score > team1Score) {
                team2Time += (currentTime - prevTime);
            }

            if (team == 1) {
                team1Score++;
            } else {
                team2Score++;
            }

            prevTime = currentTime;
        }

        if (team1Score > team2Score) {
            team1Time += (48 * 60 - prevTime);
        } else if (team2Score > team1Score) {
            team2Time += (48 * 60 - prevTime);
        }
        System.out.println(formatTime(team1Time));
        System.out.println(formatTime(team2Time));

    }


    public static String formatTime(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }
}
