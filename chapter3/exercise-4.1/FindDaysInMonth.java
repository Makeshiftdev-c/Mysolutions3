import java.util.Scanner;

public class FindDaysInMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("Invalid input.");
			System.exit(1);
		}

		System.out.print("Enter year: ");
		int year = input.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean isFebruary = month == 2;
		boolean isOddMonth = month % 2 == 1;

		int days;
	 	if (isFebruary && isLeapYear)
			days = 29;
		else if (isFebruary)
			days = 28;
		else if (isOddMonth)
			days = 31;
		else 
			days = 30;

		switch (month) {
			case 1:  System.out.print("January");   break;
			case 2:  System.out.print("February");  break;
			case 3:  System.out.print("March");     break;
			case 4:  System.out.print("April");     break;
			case 5:  System.out.print("May");       break;
			case 6:  System.out.print("June");      break;
			case 7:  System.out.print("July");      break;
			case 8:  System.out.print("August");    break;
			case 9:  System.out.print("September"); break;
			case 10: System.out.print("October");   break;
			case 11: System.out.print("November");  break;
			case 12: System.out.print("December");  break;
		}

		System.out.println(" " + year + " has " + days + " days");
	}
}