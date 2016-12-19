package p08_CardGame;

import p04_CardToString.enums.Rank;
import p04_CardToString.enums.Suit;

public class Card implements Comparable<Card>{

    private Rank rank;
    private Suit suit;
    private int cardPower;
    private String player;

    public Card(String rank, String suit, String name) {
        this.setRank(rank);
        this.setSuit(suit);
        this.setCardPower();
        this.setPlayer(name);
    }

    private void setRank(String rank) { this.rank = Enum.valueOf(Rank.class, rank); }

    private void setSuit(String suit) {
        this.suit = Enum.valueOf(Suit.class, suit);
    }

    private void setCardPower() {
        this.cardPower = rank.getPower() + suit.getPower();
    }

    private void setPlayer(String name) { this.player = name; }

    public String getRank() {
        return this.rank.name();
    }

    public String getSuit() {
        return this.suit.name();
    }

    public int getCardPower() {
        return this.cardPower;
    }

    public String getPlayer() { return this.player; }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(), this.suit.name(), this.getCardPower());
    }

    @Override
    public int compareTo(Card otherCard) {
        return Integer.compare(this.getCardPower(), otherCard.getCardPower());
    }
}
