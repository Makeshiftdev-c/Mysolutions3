import java.util.Scanner;

public class HexagonArea {
	public static void main(String[] args) {
		final double COEFFICIENT = (3 * Math.pow(3, 0.5)) / 2;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();

		double area = COEFFICIENT * Math.pow(length, 2);

		System.out.println("The area of the hexagon is " + (int) (area * 10_000 + 0.5) / 10_000.0);
	}
}