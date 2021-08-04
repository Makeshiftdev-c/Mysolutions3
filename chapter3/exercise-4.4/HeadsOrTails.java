import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int coinflipResult = (int) (Math.random() + 0.5);

		System.out.print("(0 - Heads, 1 - Tails)\n" + 
						 "Coin Flipped ^-^ \n" +
						 "Guess what it landed on: ");
		int guess = input.nextInt();

		System.out.println("The coin landed on " +
							(coinflipResult == 0 ? "Heads" : "Tails"));

		if (guess == coinflipResult)
			System.out.println("Congratulations, you guessed right!");
		else
			System.out.println("Unlucky, maybe next time!");
	}
}