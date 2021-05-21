package ChapterSeven;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        // initialize the deck
        for (int index = 0; index < deck.length; index++) {
            deck[index] = index;
            //shuffling the deck of cards
//            for(int counter=0;counter<deck.length;counter++) {
//                int random = (int) (Math.random() * deck.length);
//                int temp = deck[counter];
//                deck[counter] = deck[random];
//                deck[random] = temp;
//
//            }
// display the overall  deck of cards
            if(index%4==0){
                System.out.println();
            }
                String suit = suits[deck[index] / 13];
                String rank = ranks[deck[index] % 13];
                System.out.println("Card number " + deck[index] + ": "
                        + rank + " of " + suit);

            }
        }
    }


