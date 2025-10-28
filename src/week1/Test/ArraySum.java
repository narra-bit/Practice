package week1.Test;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter the number of elements in the array :");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter the " + (i+1) + " Element : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum of the elements : " + sum);
		
		scanner.close();
	}

}
