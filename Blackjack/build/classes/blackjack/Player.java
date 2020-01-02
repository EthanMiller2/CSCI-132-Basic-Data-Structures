/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author ethanmiller
 */
public class Player {

    private int pointCount = 500;
    private String name;
    private ArrayList<Card> hand;
    private int total;
    private boolean aceFlag;
    private static int playerNum;

    public Player(String inName) {
        name = inName;
        hand = new ArrayList<Card>();
        playerNum++;

    }

    public String getName() {
        return name;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void addToHand(Card x) {
        hand.add(x);

    }

    public ArrayList<Card> getHand() {
        return hand;

    }

    public int calcTotal() {
        int x = 0;
        for (Card c : hand) {
            if (c.getRank() == 1) {
                aceFlag = true;
            }
            x = x + c.getValue(c.getRank());

        }
        if (x > 30 && aceFlag) {
            x = x - 10;
        }

        total = x;
        return x;

    }
    public int getTotal() {
        return total;
    }

    public Card showLast() {
        return hand.get(hand.size() - 1);
    }

    public void subPointCount(int x) {
        pointCount -= x;
    }

    public void addPointCount(int x) {
        pointCount += (x * 2);
    }
    
    public static int getPlayerNum()
    {
        return playerNum;
    }

}
