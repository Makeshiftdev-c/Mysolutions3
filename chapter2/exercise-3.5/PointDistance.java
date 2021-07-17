import java.util.Scanner;

public class PointDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble(), y1 = input.nextDouble();

		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble(), y2 = input.nextDouble();

		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

		System.out.println("The distance between the two points is " + distance);
	}
}