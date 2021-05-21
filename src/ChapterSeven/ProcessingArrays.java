package ChapterSeven;

public class ProcessingArrays {
    public static void main(String[] args) {


        double[] score = new double[6];
        score[0] = 2.5;
        score[1] = 2.6;
        score[2] = 2.7;
        score[3] = 2.8;
        score[4] = 2.9;
        score[5] = 3.0;
        double totalGrade=0;
    for(int counter=0;counter< score.length;counter++){
        totalGrade+=score[counter];
        System.out.println(score[counter]);
    }

        System.out.println(totalGrade);
    }
}