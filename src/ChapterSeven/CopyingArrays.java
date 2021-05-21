package ChapterSeven;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
            System.out.print(targetArray[i]+" ");
        }
    }
}
