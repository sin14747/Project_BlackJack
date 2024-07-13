/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_structure_fundamental;

import java.util.ArrayList;




/**
 *
 * @author kulde
 * @modifier Harjot
 */





public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        // Initialize and shuffle deck
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }
    
     private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards, new Random());
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            System.out.println("The deck is empty!");
            return null;
    }
}
}
