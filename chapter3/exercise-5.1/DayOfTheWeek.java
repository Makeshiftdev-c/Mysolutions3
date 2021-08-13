import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("Error: invalid input\nMonth out of bounds");
			System.exit(1);
		}

		System.out.print("Enter the day of the month (1-31): ");
		int day = input.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean isFebruary = month == 2;
		boolean isOddMonth = month % 2 == 1;

		if ((isOddMonth && day > 31) ||
			 (!isOddMonth && day > 30) ||
			 (isFebruary && !isLeapYear && day > 28) ||
			 (isFebruary && isLeapYear && day > 29) ||
			 day < 0) {
			System.out.println("Error: invalid input\nNumber of days, in specified month, out of bounds");
			System.exit(1);
		}

		if (month < 3) {
			month += 12;
			year--;
		}
		
		int dayOfWeek = (day + (26 * (month + 1) / 10) + (year % 100) + ((year % 100) / 4)
						+ ((year / 100) / 4)  + (5 * (year / 100))) % 7;

		System.out.print("Day of the week is ");
		switch (dayOfWeek) {
			case 0: System.out.println("Saturday"); break;
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday"); break;
		}
	}
}