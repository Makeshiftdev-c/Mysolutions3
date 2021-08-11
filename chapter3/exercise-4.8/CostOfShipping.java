import java.util.Scanner;

public class CostOfShipping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight of package (pounds): ");
		double weight = input.nextDouble();

		if (weight < 0) {
			System.out.println("Error: invalid input");
			System.exit(1);
		}

		if (weight <= 20) {
		System.out.print("The cost of shipping the package is: $");
		
		if (weight <= 2)
			System.out.println("2.50");
		else if (weight <= 4)
			System.out.println("4.50");
		else if (weight <= 10)
			System.out.println("7.50");
		else
			System.out.println("10.50");
		} else
			System.out.println("The package cannot be shipped.");
	}
}