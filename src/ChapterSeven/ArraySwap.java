package ChapterSeven;

public class ArraySwap {
    public static void main(String[] args) {
int[] n={1,2,3};
        System.out.println(swap(n));
    }
public static int swap(int[] arrays){
        int temp=arrays[0];
        arrays[0]=arrays[1];
        return arrays[1]=temp;
}
}
