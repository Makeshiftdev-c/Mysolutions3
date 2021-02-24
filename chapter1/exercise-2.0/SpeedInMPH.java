public class SpeedInMPH {
	public static void main(String[] args) {
		System.out.print("Average speed (mph): ");
		// v = s/t where s = 15km, t = 50 minutes 30 seconds
		// miles = kilometers / 1.6
		// hours = minutes / 60 + (seconds / 60) / 60
		System.out.println((15.0 / 1.6) / ((50.0 / 60) + ((30.0 / 60) / 60)));
	}
}