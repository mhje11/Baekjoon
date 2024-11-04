package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//예외처리필요

public class S_3_1935 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String postFix = sc.nextLine();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double result = changeToNum(postFix, arr);
        System.out.printf("%.2f\n", result);
    }

    //스택에넣고 연산자 만날시 pop 해서 계산후 push

    public static double changeToNum(String postfix, double[] arr) throws IllegalAccessException {
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'A';
                double value = arr[index];
                stack.push(value);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                double result = calculate(a, b, ch);
                stack.push(result);

            }
        }
        return stack.pop();
    }

    public static double calculate(double a, double b, char operator) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            return a / b;
        } else
            return 0;
    }
}
