package ChapterSeven;

import java.io.OptionalDataException;
import java.util.Arrays;

public class ReversingAnArray {

    public int[] reverse(int[] list){

        int[] result=new int[list.length];
        for(int i=0,j=result.length-1;i<list.length;i++,j-- ){
            result[j]=list[i];
            System.out.print(result[j]+" ");
        }
     return result;
    }

    public static void main(String[] args) {
        ReversingAnArray reversingAnArray=new ReversingAnArray();
        int[] list1={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reversingAnArray.reverse(list1)));
    }




}
