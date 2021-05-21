package ChapterSeven;

public class FindingLargestNumberInAnArray {
    public static void main(String[] args) {
        double[] myList={1.2,2.3,9.8,4.5,5.5,6.5};
        double LargestNumber=myList[0];
        for(int counter =0;counter<myList.length;counter++){
            if(myList[counter]>LargestNumber){
                LargestNumber=myList[counter];
            }
        }
        System.out.println(LargestNumber);

    }
}
