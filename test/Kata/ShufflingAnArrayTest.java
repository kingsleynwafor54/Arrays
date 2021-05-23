package Kata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
