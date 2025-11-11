package week4.day1;

import java.util.Scanner;
@SuppressWarnings("serial")
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age); // method that throws custom exception
            System.out.println("Valid age entered: " + age);
        } 
        catch (InvalidInputException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Program ended safely.");
        }
    }

    static void validateAge(int age) throws InvalidInputException {
        if (age <= 0) {
            throw new InvalidInputException("Age must be greater than zero!");
        } else if (age > 120) {
            throw new InvalidInputException("Age seems unrealistic!");
        }
	}

}
