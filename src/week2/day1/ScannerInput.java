package week2.day1;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Name : ");
		String Name = scanner.nextLine();
		
		System.out.print("Enter the Age : ");
		int Age = scanner.nextInt();
		
		System.out.println();
		System.out.println("Hey " + Name + ", Looks like we are almost " + Age + " years old now.");
		
		scanner.close();
	}

}
