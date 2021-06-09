package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    static ArrayList<Integer> playerOne = new ArrayList<>();
    static ArrayList<Integer> playerTwo = new ArrayList<>();

    // public  String[][] gameBoard ={{},{},{}};
    String[][] gameBoard = {{"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "}};

    public Tictactoe() {

    }

    public int userInput(int userinput) {
        return userinput;
    }

    public String validatingUserInput(int userInput) {
        String changer = "";
        if (userInput == 1) {
            changer = " X ";

        } else if (userInput == 2) {
            changer = " O ";

        }
        return changer;
    }

    public String displayTictactoe(int space, int userInput) throws GameWonExceptionPlayerOne, DrawException, GameWonExceptionPlayerTwo {
        String changer = "";
        playerOne.add(space);
        playerTwo.add(space);
        switch (space) {
            case 1:
                gameBoard[0][0] = validatingUserInput(userInput);
                break;

            case 2:
                gameBoard[0][2] = validatingUserInput(userInput);
                break;
            case 3:
                gameBoard[0][4] = validatingUserInput(userInput);
                break;
            case 4:
                gameBoard[2][0] = validatingUserInput(userInput);
                break;
            case 5:
                gameBoard[2][2] = validatingUserInput(userInput);
                break;
            case 6:
                gameBoard[2][4] = validatingUserInput(userInput);
                break;
            case 7:
                gameBoard[4][0] = validatingUserInput(userInput);
                break;
            case 8:
                gameBoard[4][2] = validatingUserInput(userInput);
                break;
            case 9:
                gameBoard[4][4] = validatingUserInput(userInput);
                break;

        }

        setGameBoard(gameBoard);
        checker();
        return changer;
    }

    public String setGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        return "";
    }


    public void checker() throws GameWonExceptionPlayerOne, DrawException, GameWonExceptionPlayerTwo {

        if (gameBoard[0][0].equals(" O ") && gameBoard[0][2].equals(" O ") && gameBoard[0][4].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }

        if (gameBoard[2][0].equals(" O ") && gameBoard[2][2].equals(" 0 ") && gameBoard[2][4].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }
        if (gameBoard[4][0].equals(" O ") && gameBoard[4][2].equals(" O ") && gameBoard[4][4].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }

        if (gameBoard[0][0].equals(" O ") && gameBoard[2][0].equals(" O ") && gameBoard[4][0].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();
        }
        if (gameBoard[0][2].equals(" O ") && gameBoard[2][2].equals(" O ") && gameBoard[4][2].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }
        if (gameBoard[0][4].equals(" O ") && gameBoard[2][4].equals(" O ") && gameBoard[4][4].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }

        if (gameBoard[0][0].equals(" O ") && gameBoard[2][2].equals(" O ") && gameBoard[4][4].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }
        if (gameBoard[0][4].equals(" O ") && gameBoard[2][2].equals(" O ") && gameBoard[4][0].equals(" O ")) {
            throw new GameWonExceptionPlayerTwo();

        }
        //------------------------------------------------------------------------------------------------------------------------------------

        if (gameBoard[0][0].equals(" X ") && gameBoard[0][2].equals(" X ") && gameBoard[0][4].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }

        if (gameBoard[2][0].equals(" X ") && gameBoard[2][2].equals(" X ") && gameBoard[2][4].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }
        if (gameBoard[4][0].equals(" X ") && gameBoard[4][2].equals(" X ") && gameBoard[4][4].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }

        if (gameBoard[0][0].equals(" X ") && gameBoard[2][0].equals(" X ") && gameBoard[4][0].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }
        if (gameBoard[0][2].equals(" X ") && gameBoard[2][2].equals(" X ") && gameBoard[4][2].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }
        if (gameBoard[0][4].equals(" X ") && gameBoard[2][4].equals(" X ") && gameBoard[4][4].equals(" X ")) {
            throw new GameWonExceptionPlayerOne();

        }

        if (gameBoard[0][0].equals(" X ") && gameBoard[2][2].equals(" X ") && gameBoard[4][4].equals(" X ")) {

            throw new GameWonExceptionPlayerOne();

        }
        if (gameBoard[0][4].equals(" X ") && gameBoard[2][2].equals(" X ") && gameBoard[4][0].equals(" X ")) {

            throw new GameWonExceptionPlayerOne();

        }


    }

    public static void main(String[] args) throws DrawException, GameWonExceptionPlayerOne {
        Tictactoe tictactoe = new Tictactoe();
        Scanner scanner = new Scanner(System.in);
        for (int counter = 0; counter < 9; counter++) {
            System.out.println("Enter your placement");
            int placement = scanner.nextInt();
            System.out.println("Player");
            int value = scanner.nextInt();
            if (Tictactoe.playerOne.contains(placement) || Tictactoe.playerTwo.contains(placement)) {
                System.out.println("This position has been chosen");
                continue;

            }

            try {
                tictactoe.displayTictactoe(placement, value);

            } catch (GameWonExceptionPlayerOne e) {
                System.out.println("playerOne wins");
                break;
            } catch (GameWonExceptionPlayerTwo e) {
                System.out.println("playerTwo wins");
                break;
            }

        }

    }
}


