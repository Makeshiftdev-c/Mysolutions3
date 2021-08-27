import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double xCoord = input.nextDouble(), yCoord = input.nextDouble();

		double distanceFromCenter = Math.pow(Math.pow(xCoord, 2) + Math.pow(yCoord, 2), 0.5);

		System.out.print("Point (" + xCoord + ", " + yCoord + ") is ");

		final double RADIUS = 10.0;

		if (distanceFromCenter > RADIUS)
			System.out.print("not ");

		System.out.println("in the circle");
	}
}