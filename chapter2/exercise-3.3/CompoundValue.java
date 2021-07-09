import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		final double ANNUAL_INTEREST = 0.0375;
		final double MONTHLY_INTEREST = ANNUAL_INTEREST / 12;
		final double MONTHLY_COMPOUND_FACTOR = 1 + MONTHLY_INTEREST;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double monthlyDeposit = input.nextDouble();

		double balance = monthlyDeposit;
		double compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;
		System.out.println("After the first month, the account value is: " + compoundedBalance);

		balance = compoundedBalance + monthlyDeposit;
		compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;
		System.out.println("After the second month, the account value is: " + compoundedBalance);

		balance = compoundedBalance + monthlyDeposit;
		compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;
		System.out.println("After the third month, the account value is: " + compoundedBalance);

		balance = compoundedBalance + monthlyDeposit;
		compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;

		balance = compoundedBalance + monthlyDeposit;
		compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;

		balance = compoundedBalance + monthlyDeposit;
		compoundedBalance = balance * MONTHLY_COMPOUND_FACTOR;
		System.out.println("After the sixth month, the account value is: " + compoundedBalance);
	}
}