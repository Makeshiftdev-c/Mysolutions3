import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		final int initialPopulation = 312_032_486;
		final double expansionRate = (361.0 / 4095) * 31_536_000;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		double projectedPopulation = initialPopulation + (expansionRate * years);

		System.out.println("The population in " + years + " is " + (int) projectedPopulation);
	}
}