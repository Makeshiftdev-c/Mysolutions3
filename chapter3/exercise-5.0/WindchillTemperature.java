import java.util.Scanner;

public class WindchillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit ");
		System.out.print("between -58°F and 41°F: ");
		double temperature = input.nextDouble();

		if (temperature < -58 || temperature > 41) {
			System.out.println("Error: invalid temperature\nPlease enter a value between -58°F and 41°F (inclusive)");
			System.exit(1);
		}

		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();

		if (windSpeed < 2) {
			System.out.println("Error: invalid wind speed\nPlease enter a value greater than or equal to 2mph");
			System.exit(1);
		}

		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

		System.out.println("The wind chill index is " + (int) (windChill * 100_000 - 0.5) / 100_000.0);
	}
}