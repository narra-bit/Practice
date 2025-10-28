package week2.day2;

import java.util.Scanner;

public class ArraySumAverage {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter the number of elements in the array :");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter the " + (i+1) + " Element : ");
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		
		double average = (double) sum / n;
		
		System.out.println("Sum of the elements : " + sum);
		System.out.println("Average of the elements : " + average);
		
		scanner.close();
	}

}
