package week3.day2;

import java.util.Scanner;

public class ReplaceTrim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Trim spaces
        String trimmed = text.trim();
        System.out.println("After trim: " + trimmed);

        // Replace word
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String replaced = trimmed.replace(oldWord, newWord);
        System.out.println("After replace: " + replaced);

        // Convert to uppercase
        String upper = replaced.toUpperCase();
        System.out.println("Uppercase version: " + upper);

        sc.close();

	}

}
