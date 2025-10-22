package week1.day2;

import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Now Choose the operation you want to perform (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
        
        scanner.close();
	}

}
