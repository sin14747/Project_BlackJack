package project_structure_fundamental;

/**
 *
 * @author kulde
 */


public class Blackjack {

    private Deck deck;
    private Player dealer;
    private Player player;

    public Blackjack() {
        // Initialize deck and players
        deck = new Deck();
        dealer = new Player("Dealer");
        player = new Player("Player");
    }

    public void play() {
        // Implement the main game loop
    }

    private void initialDeal() {
        // Deal initial cards to players and dealer
    }

    private void playerTurn() {
        // Handle player actions
    }

    private void dealerTurn() {
        // Handle dealer actions
    }

    private void declareWinner() {
        // Determine and declare the winner of the game
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.play();
    }
}
