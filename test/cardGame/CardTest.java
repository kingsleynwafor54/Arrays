package cardGame;

import cardGame.exceptions.InvalidCardValueException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;


public class CardTest {



    @BeforeEach
    void beforeEach(){

}
@AfterEach
    void afterEach(){

}
@Test
    void diamondCardGameTest(){
    Card cardGame=new Card(DIAMOND,2);
    assertSame(DIAMOND,cardGame.getSuit());
}
    @Test
    void  spaceCardGameTest(){
        Card cardGame=new Card(SPADE,2);
        assertSame(SPADE,cardGame.getSuit());
    }
    @Test
    void heartCardGameTest(){
        Card cardGame=new Card(HEART,2);
        assertSame(HEART,cardGame.getSuit());
    }
    @Test
    void clubCardGameTestOne(){
        Card cardGame=new Card(CLUB,2);
        assertSame(CLUB,cardGame.getSuit());
    }
    @Test
    void aceCardGameTestTwo(){
        Card cardGame=new Card(CLUB,1);
        assertEquals("Ace",cardGame.getValue());
    }
    @Test
    void CardGameTestTwo(){
        Card cardGame=new Card(SPADE,2);
        assertSame("Jack",cardGame.getValue());
    }

    @Test
    void CardGameTestThree(){
        Card cardGame=new Card(SPADE,11);
        assertSame("Jack",cardGame.getValue());
    }
    @Test
    void CardGameTestFour(){
        Card cardGame=new Card(SPADE,2);
        assertEquals("2",cardGame.getValue());
    }
    @Test
    void CardGameTestFiv4(){
        Card cardGame=new Card(SPADE,12);
        assertSame("Queen",cardGame.getValue());
    }
    @Test
    void CardGameTestSix(){
        Card cardGame=new Card(SPADE,9);
        assertEquals("9",cardGame.getValue());
    }
@Test
    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
  assertThrows(InvalidCardValueException.class,()->new Card(DIAMOND,17));
}


}
