package Kata;

import java.util.Arrays;
import java.util.Random;

public class ShufflingAnArray {
   // SecureRandom secureRandom = new SecureRandom();
    Random secureRandom=new Random();

    public  String  shuffle(int[] number) {
        int store = 0;
        int counter = 0;
        //  = new int[number.length];
        for (counter = 0; counter < number.length; counter++) {
            int random = secureRandom.nextInt(number.length);


            store = number[counter];
            number[counter] = number[random];
            number[random] = store;
        }
//        for (counter= 0; counter < number.length; counter++) {
//            System.out.print(number[counter]+", ");
//
//    }
//
//        System.out.println();
    return Arrays.toString(number);
    }
public int[] ascendingSorting(int[]number) {
    for (int counter = 0; counter <number.length-1; counter++) {
        if (number[counter] >number[counter + 1])
        {
            int smallest= number[counter];
            number[counter] = number[counter + 1];
            number[counter + 1] = smallest;
            counter=-1;
        }

    }
    return number;
}






   public int[] descendingSorting(int[] number) {
        for (int counter = 0; counter < number.length -1; counter++)
        {
            if (number[counter] <number[counter + 1])
            {
                int largest= number[counter];
                number[counter] = number[counter + 1];
                number[counter + 1] = largest;
                counter=-1;
            }

        }
        return number;
    }
public int smallestNumber(int[] number){
        int smallest=number[0];
        for(int counter=0;counter<number.length-1;counter++){

            if(smallest>number[counter]){
                smallest=number[counter];

            }

        }

return smallest;


    }
    public int largestNumber(int[] number){
        int largest=number[0];
        for(int counter=0;counter<number.length-1;counter++){

            if(largest<number[counter]){
                largest=number[counter];

            }

        }

        return largest;


    }

}