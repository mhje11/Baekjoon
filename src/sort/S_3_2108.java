package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;




public class S_3_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(ArithmeticMean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }

    public static int ArithmeticMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        return (int) Math.round(avg);
    }

    public static int median(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static int mode(int[] arr) {
        // Find the maximum and minimum values in the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        // Determine the size of the modeCount array
        int range = max - min + 1;
        int[] modeCount = new int[range];

        // Count the occurrences of each element in the array
        for (int i : arr) {
            modeCount[i - min]++;
        }

        // Find the mode value
        int modeIndex = 0;
        int modeValue = 0;
        for (int i = 0; i < range; i++) {
            if (modeCount[i] > modeValue) {
                modeValue = modeCount[i];
                modeIndex = i;
            }
        }

        // Adjust the mode index to get the actual mode value
        int mode = modeIndex + min;

        return mode;
    }
    public static int range(int[] arr) {
        if (arr.length == 1) {
            return 0;
        } else {
            int max = 0;
            int min = 0;
            for (int i : arr) {
                if (max < i) {
                    max = i;
                }
                if (min > i) {
                    min = i;
                }
            }
            return max - min;
        }
    }
}
