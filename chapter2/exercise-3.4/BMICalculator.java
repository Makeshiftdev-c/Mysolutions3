import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double poundWeight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double inchHeight = input.nextDouble();

		double resultantBMI = (poundWeight * KILOGRAMS_PER_POUND) / Math.pow((inchHeight * METERS_PER_INCH), 2);

		System.out.println("BMI is " + (int) (resultantBMI * 10_000 + 0.5) / 10_000.0);
	}
}