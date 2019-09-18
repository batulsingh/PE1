import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        int secretNumber = 47;

        Scanner sc = new Scanner(System.in);

        int guess;

        do {

            System.out.print("Enter a guess (1-100): ");

            guess = sc.nextInt();

            if (guess == secretNumber)

                System.out.println("Your guess is correct. Congratulations!");

            else if (guess < secretNumber)

                System.out.println("Your guess is smaller than the secret number.");

            else if (guess > secretNumber)

                System.out

                        .println("Your guess is greater than the secret number.");

        } while (guess != secretNumber);

    }

}