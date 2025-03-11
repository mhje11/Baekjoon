package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G_4_3190 {
    public static int N;
    public static int K;
    public static int[][] board;
    public static Map<Integer, Character> directionChanges = new HashMap<>();
    public static int L;
    //동남서북
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int length = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = 1;
        }

        L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            directionChanges.put(time, dir);
        }

        System.out.println(playGame());

    }

    public static int playGame() {
        Deque<int[]> snake = new LinkedList<>();
        snake.add(new int[]{0, 0});
        Set<String> snakeSet = new HashSet<>();
        snakeSet.add("0,0");

        int time = 0;
        int dir = 0;

        while (true) {
            time++;
            int[] head = snake.peekFirst();
            int nx = head[0] + dx[dir];
            int ny = head[1] + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N || snakeSet.contains(nx + "," + ny)) {
                return time;
            }

            snake.addFirst(new int[]{nx, ny});
            snakeSet.add(nx + "," + ny);

            if (board[nx][ny] == 1) {
                board[nx][ny] = 0;
            } else {
                int[] tail = snake.pollLast();
                snakeSet.remove(tail[0] + "," + tail[1]);
            }

            if (directionChanges.containsKey(time)) {
                char turn = directionChanges.get(time);
                if (turn == 'D') {
                    dir = (dir + 1) % 4;
                } else {
                    dir = (dir + 3) % 4;
                }
            }
        }
    }
}
