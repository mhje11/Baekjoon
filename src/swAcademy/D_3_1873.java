package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1873 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr = new char[h][w];

            int currentH = 0;
            int currentW = 0;
            for (int j = 0; j < h; j++) {
                String s = br.readLine();
                for (int k = 0; k < w; k++) {
                    char c = s.charAt(k);
                    if (c == '<' || c == '>' || c == 'v' || c == '^') {
                        currentH = j;
                        currentW = k;
                    }
                    arr[j][k] = c;
                }
            }
            //상 하 좌 우
            int[] dx = new int[]{-1, 1, 0, 0};
            int[] dy = new int[]{0, 0, -1, 1};
            int[] current = new int[2];
            if (arr[currentH][currentW] == '<') {
                current = new int[]{dx[2], dy[2]};
            } else if (arr[currentH][currentW] == '>') {
                current = new int[]{dx[3], dy[3]};
            } else if (arr[currentH][currentW] == '^') {
                current = new int[]{dx[0], dy[0]};
            } else {
                current = new int[]{dx[1], dy[1]};
            }
            Integer.parseInt(br.readLine());
            String command = br.readLine();
            for (int j = 0; j < command.length(); j++) {
                char c = command.charAt(j);
                if (c == 'U') {
                    current = new int[]{dx[0], dy[0]};
                    int newH = currentH + current[0];
                    int newW = currentW + current[1];
                    arr[currentH][currentW] = '^';
                    if (newH < h && newH >= 0 && newW < w && newW >= 0 && arr[newH][newW] == '.') {
                        arr[currentH][currentW] = '.';
                        arr[newH][newW] = '^';
                        currentH = newH;
                        currentW = newW;
                    }
                } else if (c == 'D') {
                    current = new int[]{dx[1], dy[1]};
                    arr[currentH][currentW] = 'v';
                    int newH = currentH + current[0];
                    int newW = currentW + current[1];
                    if (newH < h && newH >= 0 && newW < w && newW >= 0 && arr[newH][newW] == '.') {
                        arr[currentH][currentW] = '.';
                        arr[newH][newW] = 'v';
                        currentH = newH;
                        currentW = newW;
                    }
                } else if (c == 'L') {
                    current = new int[]{dx[2], dy[2]};
                    arr[currentH][currentW] = '<';
                    int newH = currentH + current[0];
                    int newW = currentW + current[1];
                    if (newH < h && newH >= 0 && newW < w && newW >= 0 && arr[newH][newW] == '.') {
                        arr[currentH][currentW] = '.';
                        arr[newH][newW] = '<';
                        currentH = newH;
                        currentW = newW;
                    }
                } else if (c == 'R') {
                    current = new int[]{dx[3], dy[3]};
                    arr[currentH][currentW] = '>';
                    int newH = currentH + current[0];
                    int newW = currentW + current[1];
                    if (newH < h && newH >= 0 && newW < w && newW >= 0 && arr[newH][newW] == '.') {
                        arr[currentH][currentW] = '.';
                        arr[newH][newW] = '>';
                        currentH = newH;
                        currentW = newW;
                    }
                } else if (c == 'S') {
                    int bulletH = currentH;
                    int bulletW = currentW;
                    while (true) {
                        bulletH += current[0];
                        bulletW += current[1];

                        if (bulletH < 0 || bulletH >= h || bulletW < 0 || bulletW >= w) {
                            break;
                        }

                        char target = arr[bulletH][bulletW];
                        if (target == '#') {
                            break;
                        } else if (target == '*') {
                            arr[bulletH][bulletW] = '.';
                            break;
                        } else if (target == '-') {
                            continue;
                        }
                    }
                }
            }
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    sb.append(arr[j][k]);
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
