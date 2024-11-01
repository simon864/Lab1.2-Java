package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutte
public class Main {
    public Main() {
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String quadraticEquation(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (b - Math.sqrt(discriminant)) / (2 * a);
            return String.format(Locale.ENGLISH, "%.1f, %.1f", x1, x2);
        } else {
            return "there are no real roots";
        }
    }

    public static double sumOfSeries(int iterations) {
        double sum = 0;
        double term = 1.0 / (2 * 2 + 2 - 2);
        int n = 2;

        while (term >= Math.pow(10, -6)) {
            sum += term;
            n++;
            term = 1.0 / (n * n + n - 2);
        }
        return sum;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}