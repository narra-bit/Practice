package week2.day1;

import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Original number: " + num);

        System.out.println("Pre-increment (++num): " + (++num)); 
        System.out.println("Post-increment (num++): " + (num++));
        System.out.println("After post-increment, num = " + num);

        System.out.println("Pre-decrement (--num): " + (--num)); 
        System.out.println("Post-decrement (num--): " + (num--)); 
        System.out.println("After post-decrement, num = " + num);

        sc.close();

	}

}
