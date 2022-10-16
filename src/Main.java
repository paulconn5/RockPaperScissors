import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String p1;
        String p2;
        boolean done = false;
        boolean valid = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Player 1 enter R, P, S");
            do {
                p1 = scan.nextLine();
                if (p1.equalsIgnoreCase("R") || p1.equalsIgnoreCase("P") || p1.equalsIgnoreCase("S")) {
                    valid = true;
                } else {
                    System.out.println("You must enter R, P, or S.");
                }
            } while (!valid);

            valid = false;

            System.out.println("Player 2 enter R, P, S");
            do {
                p2 = scan.nextLine();
                if (p2.equalsIgnoreCase("R") || p2.equalsIgnoreCase("P") || p2.equalsIgnoreCase("S")) {
                    valid = true;
                } else {
                    System.out.println("You must enter R, P, or S.");
                }
            } while (!valid);

            if (p1.equalsIgnoreCase("R")) {
                if (p2.equalsIgnoreCase("S")) {
                    System.out.println("Player 1 wins with rock beating scissors!");
                } else if (p2.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins with paper beating rock!");
                } else {System.out.println("It's a tie!");}
            } else if (p1.equalsIgnoreCase("P")) {
                if (p2.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 wins with scissors beating paper!");
                } else if (p2.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 wins with paper beating rock!");
                } else {System.out.println("It's a tie!");}
            } else if (p1.equalsIgnoreCase("S")) {
                if (p2.equalsIgnoreCase("P")) {
                    System.out.println("Player 1 wins with scissors beating paper!");
                } else if (p2.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 wins with rock beating scissors!");
                } else {System.out.println("It's a tie!");}
            } else {System.out.println("It's a tie!");}

            System.out.println("Would you like to play again [Y/N]?");
            p1 = scan.nextLine();
            if (p1.equalsIgnoreCase("N")) { done = true; }

        } while (!done);
    }
}
