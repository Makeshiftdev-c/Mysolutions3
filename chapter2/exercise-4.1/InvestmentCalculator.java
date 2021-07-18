import java.util.Scanner;

public class InvestmentCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment value: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble() / 100;
		double monthlyInterestRate = annualInterestRate / 12;

		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

		System.out.println("Future value is $" + (int) (futureInvestmentValue * 100 + 0.5) / 100.0);
	}
}