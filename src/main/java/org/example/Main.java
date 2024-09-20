package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static String fizzbuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else {
            return number % 7 == 0 ? "buzz" : Integer.toString(number);
        }
    }

    public static String reverseStr(String string) {
        String result = "";

        for(int index = string.length() - 1; index >= 0; --index) {
            result = result + string.charAt(index);
        }

        return result;
    }

    public static double[] quadraticEquation(double a, double b, double c) throws Exception {
        double D = b * b - 4.0 * a * c;
        double[] x;

        if (a == 0) {
            throw new Exception("Its not quadratic equation");
        }

        if (D > 0.0) {
            x = new double[]{(-b + Math.sqrt(D)) / (2.0 * a), (-b - Math.sqrt(D)) / (2.0 * a)};
            return x;
        } else if (D == 0.0) {
            x = new double[]{-b / (2.0 * a)};
            return x;
        } else {
            throw new Exception("There are no real roots");
        }
    }

    public static double sumSerias() {
        double n = 2.0;
        double sum = 0.0;
        double memberSerias;

        do {
            memberSerias = 1.0 / (n * n + n - 2.0);
            sum += memberSerias;
            n += 1.0;
        } while(memberSerias >= Math.pow(10.0, -6.0));

        return sum;
    }

    public static boolean polindrom(String string) {
        int half;
        string = string.toLowerCase();

        if (string.length() % 2 == 0) {
            half = string.length() / 2;
        } else {
            half = (string.length() - 1) / 2;
        }

        for (int index = 0; index < half; ++index) {
            if (string.charAt(index) != string.charAt(string.length() - 1 - index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (int number = 1; number <= 500; ++number) {
            System.out.println(fizzbuzz(number));
        }
    }
}