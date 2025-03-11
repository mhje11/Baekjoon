package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] dna = new String[n];

        for (int i = 0; i < n; i++) {
            dna[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        int totalHammingDistance = 0;

        for (int i = 0; i < m; i++) {
            int[] count = new int[4];
            for (int j = 0; j < n; j++) {
                char nucleotide = dna[j].charAt(i);
                switch (nucleotide) {
                    case 'A':
                        count[0]++;
                        break;
                    case 'C':
                        count[1]++;
                        break;
                    case 'G':
                        count[2]++;
                        break;
                    case 'T':
                        count[3]++;
                        break;
                }
            }
            int maxCount = 0;
            char chosen = 'A';
            char[] nucleotides = {'A', 'C', 'G', 'T'};
            for (int k = 0; k < 4; k++) {
                if (count[k] > maxCount) {
                    maxCount = count[k];
                    chosen = nucleotides[k];
                }
            }
            sb.append(chosen);

            totalHammingDistance += n - maxCount;
        }
        System.out.println(sb.toString());
        System.out.println(totalHammingDistance);
    }
}
