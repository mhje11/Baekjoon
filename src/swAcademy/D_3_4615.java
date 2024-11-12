package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_4615 {
    //fail
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            int countB = 0;
            int countW = 0;
            if (n == 4) {
                arr[1][1] = 2;
                arr[1][2] = 1;
                arr[2][1] = 1;
                arr[2][2] = 2;

            } else if (n == 6) {
                arr[2][2] = 2;
                arr[2][3] = 1;
                arr[3][2] = 2;
                arr[3][3] = 1;
            } else {
                arr[3][3] = 2;
                arr[3][4] = 1;
                arr[4][3] = 2;
                arr[4][4] = 1;
            }
            //0 : 돌없음, 1 : 흑돌, 2: 백돌
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int color = Integer.parseInt(st.nextToken());
                if (color == 1) {
                    arr[x - 1][y - 1] = 1;
                } else {
                    arr[x - 1][y - 1] = 2;
                }
                int width = y - 1;
                int height = x - 1;

                //가로 검사(오른쪽)
                while (++width < n) {
                    if (arr[x - 1][width] == 0) {
                        break;
                    }
                    if (arr[x - 1][width] == color) {
                        for (int k = y - 1; k < width; k++) {
                            arr[x - 1][k] = color;
                        }

                    }
                }
                width = y - 1;


                //가로 검사(왼쪽)
                while (--width >= 0) {
                    if (arr[x - 1][width] == 0) {
                        break;
                    }
                    if (arr[x - 1][width] == color) {
                        for (int k = width + 1; k >= y - 1; k--) {
                            arr[x - 1][k] = color;
                        }

                    }
                }

                height = x - 1;

                //세로 검사(아래)
                while (++height < n) {
                    if (arr[height][y - 1] == color) {
                        for (int k = x - 1; k < height; k++) {
                            arr[k][y - 1] = color;
                        }

                    }
                }

                height = x - 1;
                //세로 검사(위)
                while (--height >= 0) {
                    if (arr[height][y - 1] == 0) {
                        break;
                    }
                    if (arr[height][y - 1] == color) {
                        for (int k = height + 1; k >= x - 1; k--) {
                            arr[k][y - 1] = color;
                        }

                    }
                }
                width = y - 1;
                height = x - 1;

                //대각선 오른쪽
                while (++height < n && ++width < n) {
                    if (arr[height][width] == 0) {
                        break;
                    }
                    if (arr[height][width] == color) {
                        int initialX = x - 1;
                        int initialY = y - 1;
                        while (initialX <= height && initialY <= width) {
                            arr[initialX][initialY] = color;
                            initialX++;
                            initialY++;
                        }

                    }
                }
                width = y - 1;
                height = x - 1;

                //대각선 왼쪽
                while (--height >= 0 && --width >= 0) {
                    if (arr[height][width] == 0) {
                        break;
                    }
                    if (arr[height][width] == color) {
                        int initialX = x - 1;
                        int initialY = y - 1;
                        while (height < initialX && width < initialY) {
                            arr[height][width] = color;
                            initialX--;
                            initialY--;
                        }

                    }
                }

            }
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    if (arr[k][l] == 1) {
                        countB++;
                    } else if (arr[k][l] == 2) {
                        countW++;
                    }
                }
            }
            sb.append("#").append(i).append(" ").append(countB).append(" ").append(countW).append('\n');
        }
        System.out.println(sb);
    }
}
