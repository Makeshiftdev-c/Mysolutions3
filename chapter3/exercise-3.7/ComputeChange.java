import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberofNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars > 0)
            System.out.println(" " + numberOfOneDollars + " dollar" + (numberOfOneDollars > 1 ? "s" : ""));
        if (numberOfQuarters > 0)
            System.out.println(" " + numberOfQuarters + " quarter" + (numberOfQuarters > 1 ? "s" : ""));
        if (numberOfDimes > 0)
            System.out.println(" " + numberOfDimes + " dime" + (numberOfDimes > 1 ? "s" : ""));
        if (numberofNickels > 0)
            System.out.println(" " + numberofNickels + " nickel" + (numberofNickels > 1 ? "s" : ""));
        if (numberOfPennies > 0)
            System.out.println(" " + numberOfPennies + " penn" + (numberOfPennies > 1 ? "ies" : "y"));
    }
}