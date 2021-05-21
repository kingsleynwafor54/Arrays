package ChapterSeven;

import java.util.Scanner;

public class InitializingAnArrayOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] grade=new int[8];
        int counter;
        for(counter=0;counter< grade.length;counter++){
            System.out.println("Enter your Grade");
             grade[counter]=scanner.nextInt();


        }
        System.out.println(grade[0]+"\n"+grade[1]+"\n"+grade[2]+"\n"+grade[3]+"\n"+grade[4]+"\n"+grade[5]+"\n"+grade[6]+"\n"+grade[7]);
    }
}
