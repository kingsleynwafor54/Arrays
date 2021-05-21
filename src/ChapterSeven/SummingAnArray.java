package ChapterSeven;

public class SummingAnArray {
    public static void main(String[] args) {
        double [] total=new double[10];
        double sum=0;
        for(int counter=0;counter<total.length;counter++){
            total[counter]=counter;
            sum+=total[counter];
        }
        System.out.println(sum);
    }
}
