package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_1216_Ex2 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= 10; t++) {
            Integer.parseInt(br.readLine());  // 테스트 케이스 번호
            arr = new char[100][100];

            // 배열에 데이터 채우기
            for (int i = 0; i < 100; i++) {
                String s = br.readLine();
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }

            int maxPalindromeLength = findLongestPalindrome();
            sb.append("#").append(t).append(" ").append(maxPalindromeLength).append('\n');
        }

        System.out.println(sb);
    }

    public static int findLongestPalindrome() {
        int maxLength = 1;

        // 가로 방향 회문 검사
        for (int i = 0; i < 100; i++) {
            for (int start = 0; start < 100; start++) {
                for (int end = 99; end >= start; end--) {
                    if (isPalindromeRow(i, start, end)) {
                        maxLength = Math.max(maxLength, end - start + 1);
                        break; // 더 긴 회문이 없으므로 다음 start로
                    }
                }
            }
        }

        // 세로 방향 회문 검사
        for (int j = 0; j < 100; j++) {
            for (int start = 0; start < 100; start++) {
                for (int end = 99; end >= start; end--) {
                    if (isPalindromeCol(j, start, end)) {
                        maxLength = Math.max(maxLength, end - start + 1);
                        break; // 더 긴 회문이 없으므로 다음 start로
                    }
                }
            }
        }

        return maxLength;
    }

    // 가로 회문 검사: 특정 행에서 start ~ end가 회문인지 확인
    public static boolean isPalindromeRow(int row, int start, int end) {
        while (start < end) {
            if (arr[row][start] != arr[row][end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 세로 회문 검사: 특정 열에서 start ~ end가 회문인지 확인
    public static boolean isPalindromeCol(int col, int start, int end) {
        while (start < end) {
            if (arr[start][col] != arr[end][col]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
