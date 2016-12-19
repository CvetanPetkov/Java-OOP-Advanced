package p03_CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String input2 = reader.readLine();
        Cards card = Enum.valueOf(Cards.class, input);
        Suit suit = Enum.valueOf(Suit.class, input2);
        int n = card.getPower() + suit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d",
                card.name(), suit.name(), n);
    }
}
