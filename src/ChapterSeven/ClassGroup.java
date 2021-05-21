package ChapterSeven;

import java.security.SecureRandom;

public class ClassGroup {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] cohort6 = new int[27];


        String[] names = {"Davis", "Joy", "Kingsley", "Tunde", "Evans", "Frank", "Sarah", "Isaac-John", "Audu", "Michael", "Toni", "Ezekiel", "Chigozie", "Samson", "Seyi", "Lara",
                "Grace", "Ini", "Humble", "Henry", "Francis-Obi", "Francis-Ntoka", "Damilare", "Babashola", "Besie-Jane", "Solomon", "Peter"};
        String[] groups = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        for (int counter = 0;counter < cohort6.length; counter++) {
            cohort6[counter] = counter;
            //System.out.println(cohort6[index]);
//            for (counter =0; counter < cohort6.length; counter++) {

                int temp = cohort6[counter];
                int random = secureRandom.nextInt(27);
                cohort6[counter] = cohort6[random];
                cohort6[random] = temp;


                if (counter % 4 == 0) {
                    System.out.println();
                }

                String group = groups[cohort6[random] / 4];
                String name = names[cohort6[random] % 27];
                System.out.println(" " + name + " is in group" + group);
            }

//        System.out.println(groups.length);
        }
    }


