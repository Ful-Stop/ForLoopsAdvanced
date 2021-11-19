package com.company;

public class ExercisesAdvanced {

    public static void eights() {
        int num = 10;
        int space = 0;
        int value = 8;
        for (int i = 1; i <= 4; i ++){
            num -= 2;
            for (int k = 1; k <= space; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= value; j ++){
                System.out.print(num);
                }
            System.out.println("");
            space ++;
            value -= 2;
            }

        }

    public static void alternate(int h){
        int uno = 1;
        int dos = -1;
        for (int i = 1; i <= h; i ++){
            System.out.print(uno);
            for (int j = 1; j < i; j ++) {
                    System.out.print(uno - (j * dos));
                }
            System.out.println("");

            if (uno == 1){
                uno = i;
                uno ++;
            }
            else{
                uno = 1;
            }
            dos *= -1;
            }
        }


    public static void main(String[] args) {
        eights();

        alternate(5);
    }
}

