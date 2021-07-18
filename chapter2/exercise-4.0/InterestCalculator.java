import java.util.Scanner;

public class InterestCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble(), annualInterestRate = input.nextDouble();

		double nextMonthsInterest = balance * (annualInterestRate / 1200);

		System.out.println("The interest is " + (int) (nextMonthsInterest * 100_000 + 0.5) / 100_000.0);
	}
}