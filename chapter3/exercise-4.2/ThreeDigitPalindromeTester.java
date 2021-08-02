import java.util.Scanner;

public class ThreeDigitPalindromeTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();

		boolean isPalindrome = (number % 10) == ((number / 100) % 10);

		System.out.print(number + " is ");
		if (isPalindrome)
			System.out.println("a palindrome");
		else
			System.out.println("not a palindrome");
	}
}