package StringManipulations;

import java.util.Scanner;

public class StringKata {

    public static void stringBuilders () {
        int score = 0;
        StringBuilder string = new StringBuilder("abcdefghijklmabcdefghijklm");
        for (int counter = 0; counter < string.length(); counter++) {
            if (string.indexOf("def") == counter) {
                System.out.println("you have " + score);
                System.out.println(string);

            }
            score++;

        }
    }
    public static void stringBuilders2(){
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.println(buffer.toString()+"\n"+buffer.length()+"\n"+buffer.capacity());
    }
    public static void appendMethod(){
        Scanner scanner =new Scanner(System.in);
        String k="";
        StringBuilder buffer= new StringBuilder("Hello ");
        for(int counter=0;counter<=3;counter++){
            System.out.println("Enter Your string");
            k=scanner.next();
            buffer.append(k+" ");
        }
        System.out.println(buffer);
    }
    public static void reversingAStringBuilder(){
        StringBuilder buffer= new StringBuilder("Hello ");
        for(int counter=buffer.length();counter<=0;counter--){
            buffer.append(buffer.charAt(counter));
        }
        System.out.println(buffer);
    }
    public static void main(String[] args) {
//      stringBuilders();
//      stringBuilders2();
//      appendMethod();
      reversingAStringBuilder();
    }
}