import java.util.Scanner;

public class SortThreeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();

		int smallest = (x <= y) ? x : y;
		smallest = (smallest < z) ? smallest : z;

		int largest = (x >= y) ? x : y;
		largest = (largest > z) ? largest : z;

		int middest = (x != smallest) ? x : y;
		middest = (middest != largest) ? middest : z;
		middest = (middest != smallest) ? middest : y;

		System.out.println("Three integers in non-decreasing order: " + 
							smallest + " " + middest + " " + largest);
	}
}