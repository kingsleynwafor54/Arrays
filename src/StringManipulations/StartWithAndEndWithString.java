package StringManipulations;

public class StartWithAndEndWithString {
    public static void startWithMethod(String[] startWith) {
        for (String s : startWith) {
            if (s.startsWith("mom")) {
                System.out.println(s + " matches");
            }
        }
    }
        public static void endWithMethod(String[] endWith) {
            for (String s : endWith) {
                if (s.endsWith("ed")) {
                    System.out.println(s + " matches");
                }
            }
        }
            public static void main (String[]args){
                String[] strings = {"started", "starting", "ended", "mom", "ending","pretended"};
               // startWithMethod(strings);
                endWithMethod(strings);
            }

}