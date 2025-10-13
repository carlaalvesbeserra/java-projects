import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME
        System.out.println("------------ ROCK PAPER SCISSORS GAME ------------");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);
            printChoices(computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || ((playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper")))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("y"));

        System.out.println("GOODBYE");

        scanner.close();

    }

    static void printChoices(String computerChoice) {
        String rock = """
                _______
            ---'   ____)
                  (_____)
                  (_____)
                  (____)
            ---.__(___)
            """;
        String paper = """
                 _______
            ---'    ____)____
                       ______)
                      _______)
                     _______)
            ---.__________)
            """;
        String scissors = """
            _______
        ---'   ____)____
                  ______)
               __________)
              (____)
        ---.__(___)
        """;

        switch (computerChoice) {
            case "rock" -> System.out.println(rock);
            case "paper" -> System.out.println(paper);
            case "scissors" -> System.out.println(scissors);
        }
    }

}
