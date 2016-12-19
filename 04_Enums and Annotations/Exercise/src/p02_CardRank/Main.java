package p02_CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum CardSuit {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        System.out.println(input + ":");

        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",
                    cardSuit.ordinal(), cardSuit.name());
        }
    }
}
