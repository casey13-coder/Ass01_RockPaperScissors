import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerA, playerB, playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            System.out.print("Player A - Enter your move (R, P, or S): ");
            playerA = input.nextLine().toUpperCase();
            while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                System.out.print("Invalid. Enter R, P, or S: ");
                playerA = input.nextLine().toUpperCase();
            }


            System.out.print("Player B - Enter your move (R, P, or S): ");
            playerB = input.nextLine().toUpperCase();
            while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                System.out.print("Invalid. Enter R, P, or S: ");
                playerB = input.nextLine().toUpperCase();
            }


            System.out.println("Player A chose " + name(playerA));
            System.out.println("Player B chose " + name(playerB));


            if (playerA.equals(playerB)) {
                System.out.println(name(playerA) + " vs " + name(playerB) + " — It's a Tie!");
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                System.out.println(result(playerA, playerB));
                System.out.println("Player A wins!");
            } else {
                System.out.println(result(playerB, playerA));
                System.out.println("Player B wins!");
            }


            System.out.print("Play again? [Y/N]: ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }


    public static String name(String move) {
        if (move.equals("R")) return "Rock";
        else if (move.equals("P")) return "Paper";
        else return "Scissors";
    }

    public static String result(String winner, String loser) {
        if (winner.equals("R") && loser.equals("S")) return "Rock breaks Scissors";
        else if (winner.equals("P") && loser.equals("R")) return "Paper covers Rock";
        else return "Scissors cuts Paper";
    }
}
