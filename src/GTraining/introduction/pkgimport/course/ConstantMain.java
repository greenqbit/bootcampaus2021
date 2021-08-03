package GTraining.introduction.pkgimport.course;


public class ConstantMain {

    public static final double PI = 3.14; //const public, static, final
    private static final String JANUARY = "JANUARY";

    public static final String SUNDAY = "SUNDAY";
    private static final String MONDAY = "MONDAY";
    private static final String TUESDAY = "TUESDAY";



    public static void main(String[] args) {
        int x = 10;
        Day d = Day.SUNDAY;
        System.out.println("Day: " + d);

        //string Sunday vs Enum Sunday

        // == operator
        if ( x == 10) { //Right: you can use == to compare primitvite data types
            //do somethign
        }
        if ( SUNDAY == "SUNDAY") { //BAD: non-primitive -> dont' use == to compare

        }

        if (SUNDAY.equals("SUNDAY")) {//GOOD equals method calls to check value equal

        }

        if (d == Day.SUNDAY) { //GOOD: only for Enum you can use == to compare

        }

        /*if (d == "SUNDAY") { //X Enum can be only compared with enum itself

        }*/


    }
}
