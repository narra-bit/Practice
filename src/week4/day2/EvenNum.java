package week4.day2;

public class EvenNum {

	public static void main(String[] args) {
		System.out.println("Even numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

	}

}
