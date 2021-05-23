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
        for (counter= 0; counter < number.length; counter++) {
            System.out.print(number[counter]+", ");

    }

        System.out.println();
    return Arrays.toString(number);
    }
}