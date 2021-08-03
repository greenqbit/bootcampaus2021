package GTraining.introduction;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 90;
        ar[3] = 40;
        ar[4] = 50;

        System.out.println(Arrays.toString(ar)); //unsorted

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar)); //Sorted


        for (int i=0; i < 5 ; i++ ) { //i => index
            if ( i > 10 ) {
                break;
            }
            System.out.println(ar[i]);
        }

        for(int val: ar) { //val: array value
            System.out.println(val);
        }

        int[] b = {1, 2, 3, 4};


        int month = 2 ;
        if (month == 2) {
            return;
        }

        String monthEn;
        switch (month) {
            case 1:
                monthEn = "January";
                break;
            case 2:
                monthEn = "February";
                break;
            default:
                monthEn = "Invalid";
                break;
        }
        System.out.println("Month En: " + monthEn); //February


    }
}
