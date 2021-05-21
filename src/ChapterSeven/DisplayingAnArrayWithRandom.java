package ChapterSeven;

import java.security.SecureRandom;

public class DisplayingAnArrayWithRandom {
    public static void main(String[] args) {
        SecureRandom secureRandom=new SecureRandom();
        int counter;
        double[] grade=new double[4];
        for(counter=0;counter< grade.length;counter++){
            grade[counter]=secureRandom.nextInt(100);
                    //Math.random()*100;
        }
        System.out.println(grade[0]+"\n"+grade[1]+"\n"+grade[2]+"\n"+grade[3]);
    }
}
