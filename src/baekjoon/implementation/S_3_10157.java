package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_10157 {
    public static int C;
    public static int R;
    public static boolean[][] visited;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        int waiting = Integer.parseInt(br.readLine());

        if (waiting > C * R) {
            System.out.println(0);
            return;
        }

            int currentX = 0;
            int currentY = 0;
            int rot = 0;
            int count = 1;

            visited = new boolean[R][C];

            while (count < waiting) {
                visited[currentY][currentX] = true;

                int nextX = currentX + dx[rot];
                int nextY = currentY + dy[rot];

                if (nextX < 0 || nextX >= C || nextY < 0 || nextY >= R || visited[nextY][nextX]) {
                    rot = (rot + 1) % 4;
                    nextX = currentX + dx[rot];
                    nextY = currentY + dy[rot];
                }
                currentX = nextX;
                currentY = nextY;
                count++;
            }
            System.out.println((currentX + 1) + " " + (currentY + 1));
        }
    }

