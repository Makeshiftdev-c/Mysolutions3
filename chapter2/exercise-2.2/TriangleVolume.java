import java.util.Scanner;

public class TriangleVolume {
	public static void main(String[] args) {
		final double COEFFICIENT = Math.pow(3, 0.5) / 4.0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
		double lengthOfSides = input.nextDouble();
		double heightOfPrism = input.nextDouble();

		double area = COEFFICIENT * Math.pow(lengthOfSides, 2);
		double volume = area * heightOfPrism;


		System.out.println("The area is " + (int) (area * 100) / 100.0);
		System.out.println("The volume of the Triangular prism is " + (int) (volume * 100) / 100.0);
	}
}