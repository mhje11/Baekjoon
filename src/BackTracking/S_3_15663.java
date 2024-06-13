package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_3_15663 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        boolean[] used = new boolean[N];
        ArrayList<Integer> current = new ArrayList<>();
        Set<String> result = new LinkedHashSet<>();

        backtrack(arr, used, current, result, M);
        for (String s : result) {
            System.out.println(s);
        }
    }


    public static void backtrack(int[] arr, boolean[] used, List<Integer> current, Set<String> result, int M) {
        if (current.size() == M) {
            result.add(converToString(current));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            current.add(arr[i]);
            backtrack(arr, used, current, result, M);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static String converToString(List<Integer> current) {
        StringBuilder sb = new StringBuilder();
        for (int num : current) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
