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
       hand.addCard(card);
    }

    public int getHandValue() {
         return hand.value();
    }

    public boolean isBust() {
         return hand.isBust();
    }

    public void play() {
        // Implement the logic for the player to play
    }

    @Override
    public String toString() {
        return name;
    }
}
