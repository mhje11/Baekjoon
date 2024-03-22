package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;
//sort, String
//TreeSet은 중복 허용 x 사전순으로 정렬해놓음, 이진검색해서 HashSet보다느림
//HashSet도 중복 허용x 대신 속도가 더 빠름
public class S_5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> word = new TreeSet<>(new LengthComparator());
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            word.add(br.readLine());
        }

        for (String i : word) {
            System.out.println(i);
        }
    }

    static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        }
    }

}
