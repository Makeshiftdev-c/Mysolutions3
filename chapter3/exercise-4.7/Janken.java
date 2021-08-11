import java.util.Scanner;

public class Janken {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computersDraw = (int) (Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");
		int playersDraw = input.nextInt();

		if (playersDraw < 0 || playersDraw > 2) {
			System.out.println("Error: invalid input");
			System.exit(1);
		}

		System.out.print("The computer is ");
		switch (computersDraw) {
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper"); break;
		}

		System.out.print(". You are ");
		switch (playersDraw) {
			case 0: System.out.print("scissor. "); break;
			case 1: System.out.print("rock. "); break;
			case 2: System.out.print("paper. "); break;
		}

		if (computersDraw < playersDraw)
			System.out.println("You won");
		else if (computersDraw > playersDraw)
			System.out.println("You lost");
		else
			System.out.println("It is a draw");
	}
}