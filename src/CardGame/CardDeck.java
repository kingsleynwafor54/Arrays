package CardGame;

import CardGame.exceptions.StackOverflowException;
import CardGame.exceptions.StackUnderflowException;

import java.util.Arrays;
import java.util.Random;

public class CardDeck {
    private int lastPushLocation = -1;
    private Card[] cardGame;
    Random secureRandom = new Random();
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

    public String shuffle() {
//        Card store = ;
        int counter = 0;
        //  = new int[number.length];
        for (counter = 0; counter < cardGame.length; counter++) {
            int random = secureRandom.nextInt(cardGame.length);


           Card store = cardGame[counter];
            cardGame[counter] = cardGame[random];
            cardGame[random] = store;
        }
            for(counter=0;counter<cardGame.length;counter++){
                System.out.println(cardGame[counter]);
            }
        System.out.println();
        return Arrays.toString(cardGame);

//return  Collections.shuffle(Arrays.asList(cardGame));

    }


}