import java.util.Scanner;

public class PointsInTriangle {
	public static void main(String[] args) {
		final double x1 = 0, y1 = 100;
		final double x2 = 200, y2 = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates: ");
		double xInput = input.nextDouble(), yInput = input.nextDouble();

		double slope = (y2 - y1) / (x2 - x1);

		boolean isNotAboveAdjacent =  yInput > y1 || yInput < y2;
		boolean isNotRightOfOpposite = xInput > x2 || xInput < x1;
		boolean isNotBelowHypotenuse = ((slope * xInput) + 100 - yInput) < 0 ;

		System.out.print("The point is ");

		if (isNotRightOfOpposite || isNotAboveAdjacent || isNotBelowHypotenuse)
			System.out.print("not ");

		System.out.println("in the triangle");
	}
}