package cardGame;

import cardGame.exceptions.StackOverflowException;
import cardGame.exceptions.StackUnderflowException;

public class CardDeck {
    private int lastPushLocation = -1;
    private Card[] cardGame;

    public CardDeck(int numberOfCards) {
        cardGame = new Card[numberOfCards];
    }

    public int getSize() {
        return cardGame.length;
    }

    public void push(Card cardGame) {
    if(isFull()){
        throw new StackOverflowException("Card deck is Full");
    }
        lastPushLocation++;
        this.cardGame[lastPushLocation] = cardGame;
    }

    public Card peek() {
        if(isEmpty()){
            throw new StackUnderflowException("Card deck is empty");
        }
        return cardGame[lastPushLocation];
    }

    public Card pop() {
//        CardGame poppedCard=cardGame[lastPushLocation];
//         cardGame[lastPushLocation--]=null;
//       return poppedCard;
        if (isEmpty()) {
            throw new StackUnderflowException("Card deck is empty");
        }
        return cardGame[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize()-1;
    }
}