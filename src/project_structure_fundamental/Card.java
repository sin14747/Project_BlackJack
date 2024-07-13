
package project_structure_fundamental;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kulde
 * @Modifier Harjot
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
        switch (rank) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": case "Jack": case "Queen": case "King": return 10;
            case "Ace": return 11;
            default: return 0;
        }
    }
    

    @Override
    public String toString() {
        // Return a string representation of the card
        return rank + " of " + suit;
    }
}