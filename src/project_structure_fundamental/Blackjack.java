package project_structure_fundamental;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kulde
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
            }
        }
        
    }

    private void dealerTurn() {
        System.out.println("Dealer's turn.");
        while (dealer.getHandValue() < 17) {
            dealer.addCard(deck.draw());
        }
        System.out.println("Dealer's hand: " + dealer.getHand());
    }
    

    private void declareWinner() {
      
    }
    
    private void showScores() {
    }

    private void showFinalScores() {
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.play();
    }
}
