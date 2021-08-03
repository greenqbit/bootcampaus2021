
import javax.swing.*;

public class TestWithoutPackage {

    public static void main(String[] args) { // -> properies + method

        int count1 = 10;
//    int 1count1 = 10; //X
        int count_1 = 10;
//    int count-1 = 10; //x
//    int count/1 = 10; //x

        //1. Java: OOP => Class ->to use class => via Object
        //HelloWorld obj = new HelloWorld();

        //2. Access without creating a object => keyword: static
        System.out.println("HELLO WORLD"); //\n -> new  line
        System.out.println(4);
        System.out.println(88); //sysout

        JOptionPane.showMessageDialog(null, "Java Full Stack bootcamp.");


//RUN => Source code HelloWorld.java  => compiler compile source to bytecode (HelloWorld.class) | class file =>
    }
}
