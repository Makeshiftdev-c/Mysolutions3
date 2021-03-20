import java.util.Scanner;

public class MinutesToYears {
	public static void main(String[] args) {
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_YEAR = 365;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int totalDays = minutes / (MINUTES_PER_HOUR * HOURS_PER_DAY);
		int years = totalDays / DAYS_PER_YEAR;
		int days = totalDays % DAYS_PER_YEAR;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}