package CardGame;

import CardGame.exceptions.InvalidCardValueException;

import java.util.Random;

public class Card {
    private final int value;
    private final Suit suit;

    Random secureRandom = new Random();


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
    @Override
public String toString(){
  return   getValue()+" of "+suit.toString();
}

  @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            System.out.println("you are not well!, is a dog a woman?");

            return false;
        }
        Card cardToCompare=(Card)obj;
        if (this.value== cardToCompare.value||this.suit==cardToCompare.suit ){
            return true;
        }
        return false;
//     return super.equals(obj);
    }
}
