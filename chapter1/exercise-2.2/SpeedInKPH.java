public class SpeedInKPH {
	public static void main(String[] args) {
		System.out.print("Average speed (km/h): ");
		// v = s/t where s = 24 miles, t = 1 hour 40 minutes 35 seconds
		// kilometers = miles * 1.6
		// hours = hours + minutes / 60 + (seconds / 60) / 60
		System.out.println((24 * 1.6) / (1 + (40.0 / 60) + ((35.0 / 60) / 60)));
	}
}