package p08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Card> playerOneList = new ArrayList<>();
        List<Card> playerTwoList = new ArrayList<>();

        String playerOne = reader.readLine();
        String playerTwo = reader.readLine();

        int count = 0;

        while (count <= 5) {

            String[] receivedCard = reader.readLine().split("[\\s]+");
            String rank = receivedCard[0];
            String suit = receivedCard[2];

            Card card = new Card(rank, suit, playerOne);
            System.out.println("i");

            if (card.getRank() == null || card.getSuit() == null) {
                System.out.println("No such card exists.");
            }
            if (playerOneList.contains(card.getRank()) &&
                    playerOneList.contains(card.getSuit())) {
                System.out.println("Card is not in the deck.");
            } else {
                playerOneList.add(card);
                count++;
            }

        }

        count = 0;

        while (count <= 5) {

            String[] receivedCard = reader.readLine().split("[\\s]+");
            String rank = receivedCard[0];
            String suit = receivedCard[1];

            Card card = new Card(rank, suit, playerTwo);

            if (card.getRank() == null || card.getSuit() == null) {
                System.out.println("No such card exists.");
            } else if (playerOneList.contains(card)) {
                System.out.println("Card is not in the deck.");
            } else {
                playerTwoList.add(card);
                count++;
            }

        }

        Card bestCard = null;

        for (Card card1 : playerOneList) {
            for (Card card2 : playerTwoList) {

                int compareResult = card1.compareTo(card2);
                if (compareResult > 0) {
                    Card currCard = new Card(card1.getRank(), card1.getSuit(), playerOne);
                    if (currCard.compareTo(bestCard) > 0) {
                        bestCard = currCard;
                    }
                } else {
                    Card currCard = new Card(card2.getRank(), card2.getSuit(), playerTwo);
                    if (currCard.compareTo(bestCard) > 0) {
                        bestCard = currCard;
                    }
                }

            }
        }

        System.out.printf("%s wins with %s of %s.",
                bestCard.getPlayer(), bestCard.getRank(), bestCard.getSuit());

    }
}
