import java.util.Scanner;

public class IntersectingPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble(), y1 = input.nextDouble();
		double x2 = input.nextDouble(), y2 = input.nextDouble();
		double x3 = input.nextDouble(), y3 = input.nextDouble();
		double x4 = input.nextDouble(), y4 = input.nextDouble();

		double a = y1 - y2, d = -(x3 - x4), b = -(x1 - x2), c = y3 - y4;
		double cramerDenominator = (a * d) - (b * c);

		double e, f;
		double xIntersect;
		double yIntersect;

		if (cramerDenominator != 0) {
			e = x1 * (y1 - y2) - y1 * (x1 - x2);
			f = x3 * (y3 - y4) - y3 * (x3 - x4);

			xIntersect = (e * d - b * f) / cramerDenominator;
			yIntersect = (a * f - e * c) / cramerDenominator;

			System.out.println("The intersecting point is at ("
			 + (int) (xIntersect * 100_000 + 0.5) / 100_000.0 + ", "
			  + (int) (yIntersect * 10_000 + 0.5) / 10_000.0 + ")");
		}
		else
			System.out.println("The two lines are parallel");
	}
}