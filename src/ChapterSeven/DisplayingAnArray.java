package ChapterSeven;

public class DisplayingAnArray {
    public static void main(String[] args) {
        int[] scores=new int[5];
        scores[0]=5;
        scores[1]=7;
        scores[2]=3;
        scores[3]=7;
        scores[4]=9;

        for(int counter=0;counter< scores.length;counter++){
            System.out.println(scores[counter]);
        }
        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);
    }
}
