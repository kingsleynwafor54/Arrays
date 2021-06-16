package ChapterSeven;

import java.util.Scanner;

    public class ThreeDDisplay {
        private int[][] arrays=new int[5][4];

        public void displayFirst() {
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column <= 0; column++) {
                    arrays[row][column] = 1;
                }
            }
        }
        public void displaySix() {
            for (int row = 3; row < 5; row++) {
                for (int column = 0; column <= 0; column++) {
                    arrays[row][column] = 1;
                }
            }
        }
        public void displaySecond(){
            for(int row=0;row<=0;row++){
                for (int column=0;column<4;column++){
                    arrays[row][column]=1;
                }
            }
        }
        public void displayThird(){
            for(int row=1;row<3;row++){

                arrays[row][3]=1;
            }
        }
        public void displaySeven(){
            for(int row=3;row<5;row++){

                arrays[row][3]=1;
            }
        }
        public void displayFourth(){
            for(int column=1;column<3;column++){

                arrays[2][column]=1;
            }
        }
        public void displayFive(){
            for(int column=1;column<3;column++){

                arrays[4][column]=1;
            }
        }
        public void displayArrays(){
            for(int row=0;row<arrays.length;row++){
                for(int column=0;column<arrays[row].length;column++){
                    if(column%5==0){
                        System.out.println();
                    }
                    System.out.print(  arrays[row][column]+" ");
                }
            }

        }
        public void generalSwitch(int num){
            switch (num){
                case 1:
                    displayFirst();
                    break;
                case 2:
                    displaySecond();
                    break;
                case 3:
                    displayThird();
                    break;
                case 4:
                    displayFourth();
                    break;
                case 5:
                    displayFive();
                    break;
                case 6:
                    displaySix();
                    break;
                case 7:
                    displaySeven();
                    break;
            }
            displayArrays();
            System.out.println();
        }

        public static void main(String[] args) {
            ThreeDDisplay threeDisplay=new ThreeDDisplay();
            Scanner scanner=new Scanner(System.in);
            int counter=0;
            while (counter!=-1){
                System.out.println("Enter number");
                counter=scanner.nextInt();
                threeDisplay.generalSwitch(counter);
            }
        }

    }


