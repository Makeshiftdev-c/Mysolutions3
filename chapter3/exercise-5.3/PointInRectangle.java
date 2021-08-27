import java.util.Scanner;

public class PointInRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double xCoord = input.nextDouble(), yCoord = input.nextDouble();

		System.out.print("Point (" + xCoord + ", " + yCoord + ") is ");

		final double WIDTH = 10;
		final double HEIGHT = 5;

		// Center of rectangle (1, 1) is Offset from Origin (0, 0)
		final double X_OFFSET = 1;
		final double Y_OFFSET = 1;

		if (xCoord < 0 && xCoord < -(WIDTH / 2) + X_OFFSET ||
			xCoord > 0 && xCoord > (WIDTH / 2) + X_OFFSET ||
			yCoord < 0 && yCoord < -(HEIGHT / 2) + Y_OFFSET ||
			yCoord > 0 && yCoord > (HEIGHT / 2) + Y_OFFSET)
			System.out.print("not ");

		System.out.println("in the rectangle");
	}
}