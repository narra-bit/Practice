package week1.day3;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
        
        System.out.println("While Loop:");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nDo-While Loop:");
        i = 10; 
        do {
            System.out.println(i);
            i++;
        } while (i <= 15);

	}

}
