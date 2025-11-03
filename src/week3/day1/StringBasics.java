package week3.day1;

public class StringBasics {

	public static void main(String[] args) {
		String firstName = "Mike";
        String lastName = "Grey";

        // Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length
        System.out.println("Length of full name: " + fullName.length());

        // Character access
        System.out.println("First character: " + fullName.charAt(0));
        System.out.println("Last character: " + fullName.charAt(fullName.length() - 1));

	}

}
