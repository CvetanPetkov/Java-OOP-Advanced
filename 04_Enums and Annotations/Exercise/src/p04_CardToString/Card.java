package p04_CardToString;

import p04_CardToString.enums.Rank;
import p04_CardToString.enums.Suit;

public class Card {

    private Rank rank;
    private Suit suit;
    private int cardPower;

    public Card(String rank, String suit) {
        this.setRank(rank);
        this.setSuit(suit);
        this.setCardPower();
    }

    private void setRank(String rank) {
        this.rank = Enum.valueOf(Rank.class, rank);
    }

    private void setSuit(String suit) {
        this.suit = Enum.valueOf(Suit.class, suit);
    }

    private void setCardPower() {
        this.cardPower = rank.getPower() + suit.getPower();
    }

    private int getCardPower() {
        return this.cardPower;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(), this.suit.name(), this.getCardPower());
    }

}
