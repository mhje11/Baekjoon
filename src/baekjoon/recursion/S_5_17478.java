package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_17478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(n, 0);
    }

    public static void recursion(int n, int depth) {
        String indent = "____".repeat(depth);
        System.out.println(indent + "\"재귀함수가 뭔가요?\"");
        if (n == 0) {
            System.out.println(indent + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            System.out.println(indent + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(indent + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(indent + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            recursion(n - 1, depth + 1);
        }
        System.out.println(indent + "라고 답변하였지.");
    }
}
