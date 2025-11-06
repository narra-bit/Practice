package week3.day3;

import java.util.Scanner;

public class ParameterPassing {
	static void printLength(String str) {
        System.out.println("Length of the string \"" + str + "\": " + str.length());
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        printLength(input);
        sc.close();
	}

}
