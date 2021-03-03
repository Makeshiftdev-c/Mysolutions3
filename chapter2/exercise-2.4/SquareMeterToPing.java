import java.util.Scanner;

public class SquareMeterToPing {
	public static void main(String[] args) {
		final double PINGS_PER_SQUAREMETER = 0.3025;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();

		double pings = squareMeters * PINGS_PER_SQUAREMETER;

		System.out.println(squareMeters + " square meters is " + (int) (pings * 1000) / 1000.0 + " pings");
	}
}