package StringManipulations;

public class StringManipulations {
    public static void constructors(){
        char[] charArray={'b','i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");
        String s1=new String();
        String s2=new String(s);
        String s3=new String(charArray);
        String s4=new String(charArray,0,charArray.length);
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
    public static  void miscellaneous(){
        String s1="Hello there";
        char[] s2=new char[5];
        System.out.println(s1);
        for(int counter=0;counter<s1.length();counter++){
            System.out.print(s1.charAt(counter)+"");
        }
        System.out.println();
        System.out.println("Reversing a string");
    for(int counter=s1.length()-1;counter>=0;counter--){
        System.out.print(s1.charAt(counter)+" ");
    }
    s1.getChars(0,5,s2,0);
        System.out.println();
        System.out.println(s2);
    }
    public static void main(String[] args) {
        //constructors();
        miscellaneous();

    }
}
