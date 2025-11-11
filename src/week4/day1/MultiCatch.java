package week4.day1;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b; 
            System.out.println("Result: " + result);

            sc.nextLine(); 

            
            System.out.print("Enter any text (type 'null' to simulate NullPointer): ");
            String text = sc.nextLine();

            if (text.equalsIgnoreCase("null")) {
                text = null; 
            }

            System.out.println("Length of text: " + text.length()); 
        } 
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Program finished safely!");
        sc.close();

	}

}
