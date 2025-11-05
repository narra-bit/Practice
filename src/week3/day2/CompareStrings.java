package week3.day2;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal (case ignored).");
        } else {
            System.out.println("Strings are not equal.");
        }

        sc.close();

	}

}
