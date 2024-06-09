package project_structure_fundamental;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kulde
 */



public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        // Initialize card with rank and suit
        this.rank = rank;
        this.suit = suit;
    }

    public int value() {
        // Return the value of the card
        return 0;
    }

    @Override
    public String toString() {
        // Return a string representation of the card
        return rank + " of " + suit;
    }
}
