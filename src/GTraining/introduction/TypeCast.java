package GTraining.introduction;

public class TypeCast {

    public static void main(String[] args) {

        //() -> type casting
        double d = 9.997; //9.997 => 8 byte
        int in = (int)d; // => 4 byte -> not compatible
        System.out.println("D in: "+ d + " " + in);

        int i = 500; //4byte
        long il = i; //8 byte compatible
        float f = i; //8 byte : in-compatible but no information loss
        double fd = i;

        //type promotion
        byte b = 50; // 1 byte, short 2 byte, int 4 b, long 8b
//        b = 100; //no error
        b = (byte)(b * 2); // b * 2 => integer

        int in2 = 100;
        float fl2 = 90.5f;

        float re = in2 * fl2;//float

    }

}
