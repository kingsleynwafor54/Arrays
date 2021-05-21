package ChapterSeven;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){
        int a=0,b=0,c=0,d=0,f=0,g=0,h=0,i=0,j=0,e=0;

        Scanner scanner=new Scanner(System.in);
        for(int counter=0;counter<10;counter++) {
            System.out.println("Enter your amount");
            double amount = scanner.nextDouble();
            double saleCommission = 200 + (0.09 * amount);
            if(saleCommission>1000)
                saleCommission=1000;
            switch ((int) (saleCommission / 100)) {
                case 2 -> a++;
                case 3 -> b++;
                case 4 -> c++;
                case 5 -> d++;
                case 6 -> e++;
                case 7 -> f++;
                case 8 -> g++;
                case 9 -> h++;
                case 10 -> i++;
            }
        }
            int[] saleCom={a,b,c,d,e,f,g,h} ;



       for(int index=0;index<saleCom.length;index++){
           System.out.print(saleCom[index]+" ");
       }

        }

    }
