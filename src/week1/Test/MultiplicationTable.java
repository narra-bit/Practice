package week1.Test;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the number :");
		int n = scanner.nextInt();
		
		for(int i=0; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
		scanner.close();

	}

}
