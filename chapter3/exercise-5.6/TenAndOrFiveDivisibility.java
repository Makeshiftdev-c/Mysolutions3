import java.util.Scanner;

public class TenAndOrFiveDivisibility {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		System.out.println("Is " + integer + " divisible by 4 and 5? " +
			(integer % 4 == 0 && integer % 5 == 0));

		System.out.println("Is " + integer + " divisible by 4 or 5? " +
			(integer % 4 == 0 || integer % 5 == 0));

		System.out.println("Is " + integer + " divisible by 4 or 5 but not both? " +
			(integer % 4 == 0 ^ integer % 5 == 0));	
	}
}