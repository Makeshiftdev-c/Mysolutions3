import java.util.Scanner;

public class QuadraticCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

		double discriminant = Math.pow(b, 2) - (4 * a * c);

		System.out.print("The equation has ");

		if (discriminant < 0.0) {
			System.out.println("no real roots");
			System.exit(0);
		}

		double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

		if (discriminant > 0.0)
			System.out.println("two roots " + (int) (root1 * 1_000_000) / 1_000_000.0 +
							    " and " +     (int) (root2 * 100_000) / 100_000.0);
		else
			System.out.println("one root " + (int) (root1 * 1_000_000) / 1_000_000.0);
	}
}