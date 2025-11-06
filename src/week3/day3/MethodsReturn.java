package week3.day3;

import java.util.Scanner;

public class MethodsReturn {
	static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
        sc.close();
	}

}