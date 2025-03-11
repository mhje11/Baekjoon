package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_5212 {
    public static int R;
    public static int C;
    public static char[][] map;
    public static char[][] afterMap;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        afterMap = new char[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X') {
                    int seaCount = 0;
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if (ni < 0 || nj < 0 || ni >= R || nj >= C || map[ni][nj] == '.') {
                            seaCount++;
                        }
                    }

                    afterMap[i][j] = (seaCount >= 3) ? '.' : 'X';
                } else {
                   afterMap[i][j] = '.';
                }
            }
        }

        int minRow = R, maxRow = 0, minCol = C, maxCol = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (afterMap[i][j] == 'X') {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(afterMap[i][j]);
            }
            System.out.println();
        }
    }
}
