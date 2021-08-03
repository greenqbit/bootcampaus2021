package GTraining.introduction;

public class Student {

    int marks = 80; //instance

    public static void main(String[] args) { //inside method variable:  Local variable
        //1. Create object of Class Course
        Course javaCourse = new Course(); //instance

        //2. Run ShowCourse()
        javaCourse.showCourse();

        //3. PRINT PI
        System.out.println(javaCourse.PI);
//        System.out.println(Course.PI); //Error
        System.out.println(Course.G); //static variable


        //Literal========
        int x;
        x = 10;
        System.out.println(x);

        int x2 = 20; //variable literal  ==> Local variable
        System.out.println(x2);

        //If language have types => type safe language
        //integer -> RAM: 4 byte, what type?
        int no = 10;
        int no1 = -10;
        int no2 = 0;

        double taxRate = 18.5;
//        float taxRateF = 18.5;

        //Datatype Integer
        byte b = -127;
        byte b2 = 127;
//        byte bOver = 128;
        short srt = 128;
        short srt2 = 32000;

        int in = 70000;
        int in2 = 214748633;
        int in3 = 214748633; //default
        long ln = 214748635; //int
        long ln2 = 214748635l; //int //suffix l

        long lnL = 214748633; //int //Suffix

        float bodytem = 98.6F; //4 byte
        float bodytem2 = 98.6f; //4 byte
        double bodytem3 = 98.6; //8 byte: default decimal

        boolean pass = true; //1 byte

        //न , 255: ASCII code
        // A: 65
        char c = 'A'; //2 byte , in C: 1 byte
        char nepa = 'न'; //unicode

        //above : Primitive datatype: every langugae => OS level support.

        //Non Primitive Data Type
        String name = "JAVA"; //['J','A', 'V','A'];
        char[] names = new char[] {'J','A', 'V','A'}; //C, JAVA
        int[] nos = new int[]{10,20,30};


        System.out.println(0xF);
        System.out.println(0b1001);

        int no6 = 10_00_000;
        System.out.println("AMount: " + no6);

    }



}
