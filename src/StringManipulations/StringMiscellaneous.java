package StringManipulations;

import java.util.Locale;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String k1="Hello";
        String k2="World";
        String k3="   Space";
        System.out.println(k1.toUpperCase(Locale.ROOT));
        System.out.println(k1.toLowerCase(Locale.ROOT));
        System.out.println(k3.trim());
        System.out.println(k2.replace('W','B'));
        char[] charArrays="Hello".toCharArray();
        for(char k:charArrays){
            System.out.print(k);
            char[] chars={'a','b','c','d','e','f','g'};
            boolean booleanValue=true;
            char characterValue='z';
            int intergerValue=7;
            long longValue=10000000000L;
            float floatValue=2.5f;
            double doubleValue=3.33;
            Object objectReference="Hello";
            System.out.println(booleanValue);
            System.out.println(String.valueOf(characterValue));
            System.out.println(String.valueOf(chars,3,3));
            System.out.println(String.valueOf(chars));
            System.out.println(String.valueOf(intergerValue));
            System.out.println(String.valueOf(longValue));
            System.out.println(String.valueOf(floatValue));
            System.out.println(String.valueOf(doubleValue));
            System.out.println(String.valueOf(objectReference));
        }
    }
}
