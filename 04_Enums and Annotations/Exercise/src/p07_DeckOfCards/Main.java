package p07_DeckOfCards;

import p07_DeckOfCards.enums.Rank;
import p07_DeckOfCards.enums.Suit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(rank.name() + " of " + suit.name());
            }
        }
    }
}
