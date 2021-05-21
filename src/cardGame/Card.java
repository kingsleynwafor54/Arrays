package cardGame;

import cardGame.exceptions.InvalidCardValueException;

public class Card {
    private final int value;
    private final Suit suit;



    public Card(Suit suit, int value){
        if(value <1 || value>13) {
            throw new InvalidCardValueException("value + is not a valid card value");
        }
            this.value = value;
        this.suit=suit;
    }

    public String getValue() {
        return switch (this.value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12-> "Queen";
            case 13-> "King";
            default -> ""+value;
        };
    }

    public Suit getSuit() {
        return suit;
    }
}
