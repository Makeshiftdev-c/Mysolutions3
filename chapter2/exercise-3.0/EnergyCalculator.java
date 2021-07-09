import java.util.Scanner;

public class EnergyCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double weightOfWater = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energyNeeded = weightOfWater * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + (int) (energyNeeded * 100 + 0.5) / 100.0 );
	}
}