package week1.day2;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//EvenorOdd
		System.out.print("Enter the Num : ");
		int n = scanner.nextInt();
		if (n % 2 ==0){
			System.out.println("The Num " + n +  " is Even.");
				
		} 
		else {
			
			System.out.println("The Num " + n + " is Odd.");
		}
		
		System.out.println();
		
		//Compare the Numbers
		System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
		scanner.close();

	}

}
