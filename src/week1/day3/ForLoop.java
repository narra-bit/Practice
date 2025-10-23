package week1.day3;

public class ForLoop {

	public static void main(String[] args) {
		int initialsum = 0;
		System.out.println("Numbers from 1 to 10:");
		
        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
            initialsum += n;
        }
        System.out.println("Sum = " + initialsum);

	}

}
