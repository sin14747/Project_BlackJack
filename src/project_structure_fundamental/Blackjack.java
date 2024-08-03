package project_structure_fundamental;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kulde
 * @modifier harjot 
 * @modifier kuldeep
 */
public class Blackjack {

    private Deck deck;
    private Player dealer;
    private ArrayList<Player> players;
    private Scanner scanner;

    public Blackjack() {
        // Initialize deck and players
        deck = new Deck();
        dealer = new Player("Dealer");
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void play() {
        setupPlayers();
        initialDeal();
        playerTurn();
        dealerTurn();
        showScores();
        declareWinner();
        showFinalScores();
    }

    private void setupPlayers() {
        int numPlayers = 0;
        while (numPlayers < 1 || numPlayers > 4) {
            System.out.print("Enter the number of players (1-4): ");
            numPlayers = scanner.nextInt();
            if (numPlayers < 1 || numPlayers > 4) {
                System.out.println("Invalid number of players. Please enter a number between 1 and 4.");
            }
        }
        scanner.nextLine();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }
    }

    private void initialDeal() {
        for (Player player : players) {
            player.addCard(deck.draw());
            player.addCard(deck.draw());
        }
        dealer.addCard(deck.draw());
        dealer.addCard(deck.draw());
    }

    private void playerTurn() {
        for (Player player : players) {
            while (true) {
                System.out.println(player.getName() + "'s hand: " + player.getHand());
                System.out.println(player.getName() + "'s current score: " + player.getHandValue());
                System.out.print("Would you like to hit or stand? (h/s): ");
                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("h")) {
                    player.addCard(deck.draw());
                    if (player.isBust()) {
                        System.out.println(player.getName() + " is bust!");
                        break;
                    }
                    
                } else if (action.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("Invalid action. Please enter 'h' to hit or 's' to stand.");
                }
                System.out.println(player.getName() + "'s current score: " + player.getHandValue());
            }
        }
    }

    private void dealerTurn() {
        System.out.println("Dealer's turn.");
        while (dealer.getHandValue() < 17) {
            dealer.addCard(deck.draw());
        }
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer's current score: " + dealer.getHandValue());
    }

    private void declareWinner() {
        System.out.println("Game Over!");
        System.out.println("--------------");
        int dealerScore = dealer.getHandValue();
        boolean dealerBust = dealer.isBust();

        for (Player player : players) {
            int playerScore = player.getHandValue();
            if (player.isBust() || (!dealerBust && dealerScore > playerScore)) {
                System.out.println(player.getName() + " loses.");
            } else if (dealerBust || playerScore > dealerScore) {
                System.out.println(player.getName() + " wins!");
            } else {
                System.out.println(player.getName() + " ties with the dealer.");
            }
        }

        if (dealerBust) {
            System.out.println("Dealer is bust and loses to all remaining players.");
        } else {
            System.out.println("Dealer's final score: " + dealerScore);
            for (Player player : players) {
                int playerScore = player.getHandValue();
                if (!player.isBust() && dealerScore > playerScore) {
                    System.out.println("Dealer wins against " + player.getName());
                } else if (dealerScore == playerScore) {
                    System.out.println("Dealer ties with " + player.getName());
                }
            }
        }
    }

    private void showScores() {
        System.out.println("\nCurrent Scores:");
        System.out.println("------------------");
        for (Player player : players) {
            System.out.println(player.getName() + "'s score: " + player.getHandValue());
        }
        System.out.println("Dealer's score: " + dealer.getHandValue());
        System.out.println();
    }

    private void showFinalScores() {
        System.out.println("\nFinal Scores:");
        System.out.println("--------------");
        for (Player player : players) {
            System.out.println(player.getName() + "'s final score: " + player.getHandValue());
        }
        System.out.println("Dealer's final score: " + dealer.getHandValue());
        System.out.println();
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.play();
    }
    
}