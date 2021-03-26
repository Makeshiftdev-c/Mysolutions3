import java.util.Scanner;

public class Acceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter v0, v1, and t: ");
		double initialVelocity = input.nextDouble(), finalVelocity = input.nextDouble(), timeElapsed = input.nextDouble();

		double acceleration = (finalVelocity - initialVelocity) / timeElapsed;

		System.out.println("The average acceleration is " + (int) ((acceleration + 0.00005) * 10_000) / 10_000.0);
	}
}