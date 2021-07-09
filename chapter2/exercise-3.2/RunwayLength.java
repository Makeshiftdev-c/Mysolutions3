import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble(), acceleration = input.nextDouble();

		double minimumLength = Math.pow(speed, 2) / (2 * acceleration);

		System.out.println("The minimum runway length for this airplane is " + (int) (minimumLength * 1000 + 0.5) / 1000.0);
	}
}