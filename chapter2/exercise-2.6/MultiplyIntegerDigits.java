import java.util.Scanner;

public class MultiplyIntegerDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();

		int firstDigit = (((number - 1) / 1) + 1) % 10;
		int secondDigit = (((number - 10) / 10) + 1) % 10;
		int thirdDigit = (((number - 100) / 100) + 1) % 10;

		int productOfDigits = firstDigit * secondDigit * thirdDigit;

		System.out.println("The multiplication of all digits in " + number + " is " + productOfDigits);
	}
}