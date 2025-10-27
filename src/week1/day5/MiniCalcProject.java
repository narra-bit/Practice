package week1.day5;

import java.util.Scanner;

public class MiniCalcProject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("===== Simple Calculator =====");

        // Taking the input from the users
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Now asking the user to select the operation to perform of their choice 
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;

        // now the program is for calculation based on user choice
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot perform division by 0");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select 1–4.");
        }

        // Step 4: Close the scanner
        scanner.close();

        System.out.println("===== Calculation Complete =====");

	}

}
