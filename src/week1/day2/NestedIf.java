package week1.day2;

import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Your Grade is : A");
            } else if (score >= 75) {
                System.out.println("Your Grade is : B");
            } else {
                System.out.println("Your Grade is : C");
            }
        } else {
            System.out.println("Invalid score. The Num Must be between 0 and 100.");
        }
        scanner.close();
	}

}
