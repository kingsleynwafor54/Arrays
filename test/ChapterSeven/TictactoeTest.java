package ChapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TictactoeTest {
    Tictactoe tictactoe;
    @BeforeEach
    void beforeEach(){
     tictactoe=new Tictactoe();
    }
@AfterEach
    void afterEach(){
        tictactoe=null;
}
@Test
    void userInputMethodCanReturnNmber(){
        assertEquals(3,tictactoe.userInput(3));
}
@Test
    void validatingUserInputToChangeToXOrO(){
        assertEquals("X",tictactoe.validatingUserInput(1));
        assertEquals("O",tictactoe.validatingUserInput(2));
}
//@Test
//void displayTictatoeTest(){
//    System.out.println(tictactoe.displayTictactoe(1,1));
//    System.out.println(tictactoe.displayTictactoe(2,2));
//    System.out.println(tictactoe.displayTictactoe(4,1));
//    System.out.println(tictactoe.displayTictactoe(3,2));
//    System.out.println(tictactoe.displayTictactoe(6,2));
//    System.out.println(tictactoe.displayTictactoe(9,2));
//   // System.out.println(tictactoe.displayTictactoe(3,1));
//      //  assertEquals("X",tictactoe.displayTictactoe(1,1));
//}

@Test

void setGameBoardTest(){
//
    String[][] gameBoard = {{"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "}};
    System.out.println(tictactoe.setGameBoard(gameBoard));

}
@Test
    void validatingUserInputCanBePlaceInAnArrayList(){
         tictactoe.validatingUserInput(1);
         tictactoe.validatingUserInput(1);
         tictactoe.validatingUserInput(1);
         tictactoe.validatingUserInput(1);
         tictactoe.validatingUserInput(1);
         tictactoe.validatingUserInput(2);
         tictactoe.validatingUserInput(2);
         tictactoe.validatingUserInput(2);
         tictactoe.validatingUserInput(2);
         tictactoe.validatingUserInput(2);
   // System.out.println(tictactoe.checker());
         assertEquals(5, Tictactoe.playerOne.size() );
         assertEquals(5, Tictactoe.playerTwo.size() );
}
@Test
    void tictactoeCanDetectWinsForPlayerOneAndPlayerTwo(){


}
}
