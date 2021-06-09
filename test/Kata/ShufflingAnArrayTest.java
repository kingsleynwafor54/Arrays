package Kata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ShufflingAnArrayTest {
    ShufflingAnArray shufflingAnArray;
    @BeforeEach
    void beforeEach(){
        shufflingAnArray=new ShufflingAnArray();
    }
    @AfterEach
    void afterEach(){
        shufflingAnArray=null;
    }
@Test
    void methodCanShuffleAnArray(){
        int[] number={1,3,4,5,6,9,19,13,2,17,8,6,};
    System.out.println(shufflingAnArray.shuffle(number));

  assertNotEquals(number[2],shufflingAnArray.shuffle(number));
}
    @Test
    void methodAscendingSortingTest(){
        int[] number={1,3,4,5,6,9,19,13,2,17,8,6,};
        System.out.println(Arrays.toString(shufflingAnArray.ascendingSorting(number)));


        assertNotEquals(number[2],shufflingAnArray.ascendingSorting(number));
    }
@Test
    void methodDescendingSortingTest(){
    int[] number={1,3,4,5,6,9,19,13,2,17,8,6,};
    System.out.println(Arrays.toString(shufflingAnArray.descendingSorting(number)));
    assertNotEquals(Arrays.toString(number),shufflingAnArray.descendingSorting(number));
}
@Test
    void methodSmallestNumber(){
    int[] number={3,4,5,6,9,19,13,2,17,8,6,};
    System.out.println(shufflingAnArray.smallestNumber(number));
assertEquals(2,shufflingAnArray.smallestNumber(number));
}

    @Test
    void methodLargestNumber(){
       // int[] number={3,4,5,6,9,19,13,2,17,8,6,};
        String[] arr={"Kingsley",":1001","Chuks",":1002","Ebuka",":1003","Daniel",":1004"};
        System.out.println(shufflingAnArray.printingValuesWithKey(arr));
//        System.out.println(shufflingAnArray.largestNumber(number));
//        assertEquals(19,shufflingAnArray.largestNumber(number));
    }

}
