public class PopulationProjection {
	public static void main(String[] args) {
		// 1 person / 7 seconds - 1 person / 13 seconds + 1 person / 45 seconds = 361 people / 4095 seconds
		// seconds in 365 days = 365 days * 24 hours/day * 60 minutes/hour * 60 seconds/minute = 31,536,000 seconds
		// hence population increase = rate of peoples * seconds in one year * number of years
		// therefore population in any given year = initial population + population increase.

		System.out.print("Year 1: ");
		System.out.println(312032486 + ((361.0 / 4095) * 31536000 * 1));

		System.out.print("Year 2: ");
		System.out.println(312032486 + ((361.0 / 4095) * 31536000 * 2));

		System.out.print("Year 3: ");
		System.out.println(312032486 + ((361.0 / 4095) * 31536000 * 3));

		System.out.print("Year 4: ");
		System.out.println(312032486 + ((361.0 / 4095) * 31536000 * 4));

		System.out.print("Year 5: ");
		System.out.println(312032486 + ((361.0 / 4095) * 31536000 * 5));
	}
}