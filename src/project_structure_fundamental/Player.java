/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_structure_fundamental;

/**
 *
 * @author kulde
 */



public class Player {
    private String name;
    private final Hand hand;

    public Player(String name) {
        this.name = name;
        // Initialize hand
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void addCard(Card card) {
        // Add a card to the player's hand
    }

    public int getHandValue() {
        // Get the total value of the player's hand
        return 0;
    }

    public boolean isBust() {
        // Check if the player's hand is bust
        return false;
    }

    public void play() {
        // Implement the logic for the player to play
    }

    @Override
    public String toString() {
        return name;
    }
}
