package ChapterSeven;

public class StringReverser {
    public static void main(String[] args) {
        String k="kingsley";
        for(int counter=k.length()-1;counter>=0;counter--){
            System.out.print(k.charAt(counter)+",");
        }
    }
}
