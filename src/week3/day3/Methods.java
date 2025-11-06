package week3.day3;

import java.util.Scanner;
public class Methods {
	static int sum(int a, int b) {
        return a + b;
    }

    // Non-static method for factorial
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for sum
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int total = sum(num1, num2);
        System.out.println("Sum: " + total);

        // Input for factorial
        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        Methods obj = new Methods();
        int result = obj.factorial(n);
        System.out.println("Factorial: " + result);

        sc.close();
    }
}