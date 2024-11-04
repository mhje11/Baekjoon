package example;

import java.util.Arrays;

public class barkingDog_array_02 {
    public static void main(String[] args) {
        int i = func2(new int[]{59, 32});
        int i2 = func2_2(new int[]{59, 32});
        System.out.println(i);
        System.out.println(i2);
    }

    public static int func2(int arr[]) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if(arr[left] + arr[right] == 100) {
                return 1;
            } else if (arr[left] + arr[right] < 100) {
                left++;
            } else
                right--;
        }
        return 0;
    }

    public static int func2_2(int[] arr) {
        int[] occur = new int[101];
        for (int i = 0; i < arr.length; i++) {
            if (occur[100 - arr[i]] == 1) {
                return 1;
            }
            occur[arr[i]] = 1;
        }
        return 0;
    }
}
