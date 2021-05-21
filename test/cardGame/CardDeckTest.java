package cardGame;

import cardGame.exceptions.StackOverflowException;
import cardGame.exceptions.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    CardDeck cardDeck;
    @BeforeEach
    void beforeEach() {
        cardDeck=new CardDeck(4);
    }

    @Test
    void cardDeckHasFixedSize() {
        assertEquals(4, cardDeck.getSize());
    }

    @Test
    void pushOnce_elementPushedShouldBeLast() {
        Card cardGame = new Card(DIAMOND, 4);
        cardDeck.push(cardGame);
        assertEquals(cardGame, cardDeck.peek());
    }

    @Test
    void pushTwicePopOneAndThenPeekShouldReturnTheFirstElement() {
        Card firstCard = new Card(DIAMOND, 4);
        Card secondCard = new Card(CLUB, 7);
        Card thirdCard = new Card(SPADE, 8);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push(firstCard);
        //cardDeck.pop();
        Card poppedCard=cardDeck.pop();

       assertSame(firstCard,poppedCard);
        assertEquals(thirdCard, cardDeck.peek());

    }
@Test
    void popEmptyCardDeck_throwsStackUnderflowException(){
      assertTrue(cardDeck.isEmpty())  ;
      assertThrows(StackUnderflowException.class,()->cardDeck.pop());

    }
@Test
    void pushIntoFullDeckThrowsStackOverFlowException(){
        Card cardGame=new Card(SPADE,4);
        for(int counter=0;counter<4;counter++){
            cardDeck.push(cardGame);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverflowException.class,()->cardDeck.push(cardGame));
}


    }
