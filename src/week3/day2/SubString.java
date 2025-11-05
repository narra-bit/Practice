package week3.day2;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= text.length() && start < end) {
            String sub = text.substring(start, end);
            System.out.println("Extracted substring: " + sub);
        } else {
            System.out.println("Invalid indices entered.");
        }

        sc.close();
	}

}
