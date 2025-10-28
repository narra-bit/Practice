package week2.day1;

import java.util.Scanner;

public class OperatorsPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number (a) : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Number (b) : ");
		int b = sc.nextInt();
		
		System.out.println();
		System.out.println("***Arthimetic Operations***");
		System.out.println();
		System.out.println("Addition (a+b) : " +(a+b));
		System.out.println("Subtraction (a-b) : " +(a-b));
		System.out.println("Multiplication (a*b) : " +(a*b));
		System.out.println("Division (a/b) : " +(a/b));
		System.out.println("Remainder (a%b) : " +(a%b));
		
		System.out.println();
		System.out.println("***Relational Operations***");
		System.out.println();
		System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
        System.out.println();
		System.out.println("***Logical Operations***");
		System.out.println();
		boolean cond1 = (a > 0);
        boolean cond2 = (b > 0);
        System.out.println("Both Condition Met (AND): " + (cond1 && cond2));
        System.out.println("Either Condition Met (OR): " + (cond1 || cond2));
        System.out.println("Not Condition1: " + (!cond1));
        System.out.println("Not Condition2: " + (!cond2));
		
        System.out.println();
		System.out.println("***Assignments Operations***");
		System.out.println();
        int x = a; 
        System.out.println("Initial x = " + x);
        x += b;
        System.out.println("x += b : " + x);
        x -= b;
        System.out.println("x -= b : " + x);
        x *= b;
        System.out.println("x *= b : " + x);
        x /= (b != 0 ? b : 1); 
        System.out.println("x /= b : " + x);
        x %= (b != 0 ? b : 1);
        System.out.println("x %= b : " + x);
        
        sc.close();
       
	}

}
