import java.util.Scanner;

public class LinearEquationSolver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		double d = input.nextDouble(), e = input.nextDouble(), f = input.nextDouble();

		double cramerDenominator = (a * d) - (b * c);

		if (cramerDenominator == 0.0) {
			System.out.println("The equation has no solution");
			System.exit(0);
		}

		double xAxisIntersection = ((e * d) - (b * f)) / cramerDenominator;
		double yAxisIntersection = ((a * f) - (e * c)) / cramerDenominator;

		System.out.println("x is " + (int) (xAxisIntersection * 100) / 100.0 + " and " +
						   "y is " + (int) (yAxisIntersection * 100) / 100.0); 
	}
}