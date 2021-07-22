import java.util.Scanner;

public class MultiplicationQuiz {
	public static void main(String[] args) {
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);
		int number3 = (int) (System.currentTimeMillis() / 100 % 10);

		Scanner input = new Scanner(System.in);

		// \u00D7 == UTF-16 Multiplication Sign
		System.out.print("What is "      + number1 
						    + " \u00D7 " + number2
						    + " \u00D7 " + number3
						    + "? ");

		int answer = input.nextInt();

		System.out.println(number1 + " \u00D7 " + number2 + " \u00D7 "
						     + number3 + " = " + answer + " is " +
						    (number1 * number2 * number3 == answer));
	}
}