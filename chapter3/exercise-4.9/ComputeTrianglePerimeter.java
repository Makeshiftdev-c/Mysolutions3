import java.util.Scanner;

public class ComputeTrianglePerimeter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of three edges of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
		System.out.println("Error: invalid input");
		System.exit(1);
		}

		double perimeter = side1 + side2 + side3;

		System.out.println("The perimeter of the triangle is " + (int) (perimeter * 100 + 0.5) / 100.0);
	}
}