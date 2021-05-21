package ChapterSeven;
//initializing array by using  loop
public class ArrayLoopIng {
    public static void main(String[] args) {
        int[] nice=new int[9];
        int counter;
        for( counter=0;counter< nice.length;counter++){
            nice[counter]=counter+1;
            System.out.print(nice[counter]+",");
        }

    }
}
