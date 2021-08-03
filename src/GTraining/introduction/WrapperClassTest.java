package GTraining.introduction;

public class WrapperClassTest {

    public static void main(String[] args) {
        int x = 10;
        Integer x2 = 10; //wrapper class of int
        Integer x3 = new Integer(25);

        Integer r1 = x + x2;//how compiler add these two primtive + wrapper
        Integer r3 = x2 + x3;

        System.out.println(x + x3);

        //Boolean
        Boolean b= true;
        Double d= 9.8;
        Long l = 23423L;


        Integer i = 50;//new Integer(50); //i object
        int i2 = i; //i.intValue() //Error : primitive -> Oly support value

        //What is advantage
        String str = "45";
        Integer in = Integer.valueOf(str); //Task : convert string to int
        int     inp= Integer.valueOf(str); //Task : convert string to int

        Long l2 = 10000L;
        int i10 = l2.intValue();

//        long l20 = null;
//        Long l23 = null;

    }

}
