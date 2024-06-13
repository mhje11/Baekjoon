package DFS_BFS;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class DFSEx {
    //https://jellili.tistory.com/26
    public final static int GRAPH_LIST_SIZE = 9;
    public static boolean[] visitedFlag = new boolean[GRAPH_LIST_SIZE];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    //보통 스택 사용
    public static void main(String[] args) {
        //리스트 초기화
        for (int i = 0; i < GRAPH_LIST_SIZE; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);
        dfs(1);
    }

    public static void dfs(int point) {
        // 현재 노드 방문 처리
        visitedFlag[point] = true;

        // 인접 노드 방문 처리
        for (int node : graph.get(point)) {
            if (!visitedFlag[node]) {
                dfs(node);
            }
        }
    }

}
