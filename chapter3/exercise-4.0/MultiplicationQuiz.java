import java.util.Scanner;

public class MultiplicationQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int integer1 = (int) (Math.random() * 1000);
		int integer2 = (int) (Math.random() * 1000);

		if (integer1 < integer2) {
			int temp = integer1;
			integer1 = integer2;
			integer2 = temp;
		}

		// 00D7 == UTF-16 Multiplication Encoding
		System.out.print("What is " + integer1 + " \u00D7 " + integer2 + "? ");
		int answer = input.nextInt();

		if (integer1 * integer2 == answer)
			System.out.println("Your are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(integer1 + " \u00D7 " + integer2 + " should be "
								+ (integer1 * integer2));
		}
	}
}