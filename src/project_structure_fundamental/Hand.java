/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_structure_fundamental;

/**
 *
 * @author kulde
 */




import java.util.ArrayList;



public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        // Initialize hand
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        // Add a card to the hand
    }

    public int value() {
        // Calculate the total value of the hand
        return 0;
    }

    public boolean isBust() {
        // Check if the hand is bust
        return false;
    }

    @Override
    public String toString() {
        // Return a string representation of the hand
        return "";
    }
}

