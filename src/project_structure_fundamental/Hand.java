/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_structure_fundamental;

/**
 *
 * @author kulde
 * @modifier kulde
 */





import java.util.ArrayList;



public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        // Initialize hand
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int value() {
            int totalValue = 0;
        int aceCount = 0;

        for (Card card : cards) {
            totalValue += card.value();
            if (card.value() == 11) {
                aceCount++;
            }
        }

        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10;
            aceCount--;
        }

        return totalValue;
    }

    public boolean isBust() {
        return value() > 21;
    }

    @Override
    public String toString() {
       return cards.toString();
    }
}
