/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ethanmiller
 */
public class Game {

    private Card[] deck = new Card[52];
    private Player[] players = new Player[Player.getPlayerNum()];
    private boolean playgame;
    private final Player Dealer;
    private Player p1;
    private int betNum;
    private int totalWinnings;
    private Random random = new Random();
    
    private Scanner scan = new Scanner(System.in);
    private boolean bust = false;

    public Game() {
        Dealer = new Player("DEALER");
        p1 = new Player("Ethan");

    }

    public void playGame() {

        startGame();

        while (playgame) {
            getBet();
            dealHand();
            askPlayer();
            checkResults();
            nextHand();

        }
    }

    //Starts the Game
    private void startGame() {

        //System.out.println("what is your name?");
        System.out.println("Would you like to play Blackjack Y|N");
        String play = scan.nextLine();
        fillDeck();
        System.out.println();
        if (play.equalsIgnoreCase("Y")) {
            playgame = true;
        }

    }

    //Fills Deck with Cards
    private void fillDeck() {
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[index] = new Card(rank, suit);
                index++;

            }
        }
    }

    //Method to Print Deck
    private void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }

    }

    private void getBet() {
        System.out.println("How much would you like to bet on the next Hand? You have " + p1.getPointCount() + " points remaining.");
        betNum = scan.nextInt();
        scan.nextLine();
        System.out.println();
        Dealer.getHand().clear();
        p1.getHand().clear();
    }

    //Method to Deal Card
    public Card dealCard() {
        int randPos = random.nextInt(51 - 0 + 1);
        Card rand = deck[randPos];
        return rand;

    }

    //Deals opening Hand
    public void dealHand() {
        for (int i = 0; i <= 2; i++) {
            Dealer.addToHand(dealCard());
            p1.addToHand(dealCard());
        }
        Dealer.calcTotal();
        p1.calcTotal();

    }

    //Asks player if they want to hit or Stand
    private void askPlayer() {
        System.out.println("Dealers last card is " + Dealer.showLast());
        System.out.println("Your hand is " + p1.getHand());
        System.out.println("Your Hand total is " + p1.getTotal() + ". Would you like to hit or stand?");

        String s = scan.nextLine();
        System.out.println();

        if (s.equalsIgnoreCase("hit")) {
            p1.addToHand(dealCard());
            p1.calcTotal();
            if (p1.getTotal() > 31) {
                System.out.println("Your hand is " + p1.getHand());
                System.out.println("Your hand total is " + p1.getTotal());
                System.out.println("You bust, Dealer wins");

                totalWinnings -= betNum;
                p1.subPointCount(betNum);
                bust = true;

                System.out.println("Total Winnings: " + totalWinnings + "\n");

            } else {
                askPlayer();
            }
        } else {
            System.out.println("You stand at " + p1.getTotal());

            while (Dealer.calcTotal() < 26) {
                Dealer.addToHand(dealCard());

            }
            System.out.println("Dealer's hand is " + Dealer.getHand());
            System.out.println("Dealer's hand total is " + Dealer.getTotal());

        }
    }

    //Checks and Prints Results of Game
    private void checkResults() {

        if (Dealer.calcTotal() == p1.calcTotal()) {
            System.out.println("You and the dealer Tie, Here is your money back.");
            System.out.println("Total Winnings: " + totalWinnings + "\n");
        } else if (p1.calcTotal() > Dealer.calcTotal() && !bust) {
            System.out.println("You win!");
            totalWinnings += betNum;
            p1.addPointCount(betNum);
            System.out.println("Total Winnings: " + totalWinnings + "\n");
        } else if (Dealer.calcTotal() > 31) {
            System.out.println("Dealer busts. You Win!");
            totalWinnings += betNum;
            p1.addPointCount(betNum);
            System.out.println("Total Winnings: " + totalWinnings + "\n");
        } else if (Dealer.getTotal() > p1.calcTotal() && Dealer.getTotal() < 32) {
            System.out.println("Dealer Wins.");
            System.out.println("Total Winnings: " + totalWinnings + "\n");
            p1.subPointCount(betNum);
        }
    }

    private void nextHand() {
        System.out.println("Would you like to play another hand? Y|N");
        String newHand = scan.nextLine();
        System.out.println();
        if (newHand.equalsIgnoreCase("Y")) {
            playgame = true;
        } else {
            playgame = false;
        }
        if (0 >= p1.getPointCount()) {
            playgame = false;
            System.out.println("You dont have any remaining points to play...");
        }

    }
    
    private void addPlayers()
    {
        System.out.println("How many players are playing?");
        int x = scan.nextInt();
    }
}
