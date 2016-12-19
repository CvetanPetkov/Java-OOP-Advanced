package p01_CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum CardSuit {
    CLUBS, DIAMONDS, HEARTS, SPADES
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
