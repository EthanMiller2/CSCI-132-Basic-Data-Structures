/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author ethanmiller
 */
public class Card {

    private int rank;
    private int suit;
    private int value;

    public Card(int inRank, int inSuit) {
        suit = inSuit;
        rank = inRank;

    }

    public String getSuit(int suit) {
        switch (suit) {
            case 1:
                return "Clubs";

            case 2:
                return "Spades";

            case 3:
                return "Diamonds";

            case 4:
                return "Hearts";

            default:
                return "?";
        }

    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String getRank(int rank) {
        switch (rank) {
            case 1:
                return "Ace";

            case 2:
                return "Two";

            case 3:
                return "Three";

            case 4:
                return "Four";

            case 5:
                return "Five";

            case 6:
                return "Six";

            case 7:
                return "Seven";

            case 8:
                return "Eight";

            case 9:
                return "Nine";

            case 10:
                return "Ten";

            case 11:
                return "Jack";

            case 12:
                return "Queen";

            case 13:
                return "King";

            default:
                return "?";

        }
    }

    public int getValue(int rank) {
        switch (rank) {
            case 1:
                return 11;

            case 2:
                return 2;

            case 3:
                return 3;

            case 4:
                return 4;

            case 5:
                return 5;

            case 6:
                return 6;

            case 7:
                return 7;

            case 8:
                return 8;

            case 9:
                return 9;

            case 10:
                return 10;

            case 11:
                return 10;

            case 12:
                return 10;

            case 13:
                return 10;

            default:
                return 0;
        }

    }

    @Override
    public String toString() {
        return this.getRank(rank) + " of " + this.getSuit(suit);

    }

}
