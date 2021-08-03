package GTraining.introduction.pkgimport.stud;

//1. package name + Class name
import GTraining.introduction.pkgimport.course.Course; //wooloong unit2 .sam; location: pkg + up to class name

//2. package name + *
import javax.swing.*; //load all the classes inside javax.swing package(folder)
//import javax.swing.JOptionPane;
//import javax.swing.JColorChooser;

//Rule: Import same name class in one  file X
import java.io.File;
//import GTraining.introduction.pkgimport.util.File; //X

//4. Import static => import static variable /method inside the class
import static java.lang.Math.PI;

public class Student {

    public static void main(String[] args) {
//        Course javaCourse = new Course();

        JOptionPane.showMessageDialog(null, "WE are testing package and import");
//        JColorChooser.getDefaultLocale();
//        JFileChooser fc = new JFileChooser();

        File file = new File("D:\\songs\\nepali"); //java.io

        //3 import full path import
        GTraining.introduction.pkgimport.util.File myUtilFile = new GTraining.introduction.pkgimport.util.File(); //util.File


        //4. static import
        double r = 3.5;
        double areaOfCircle = PI * r * r;

        //IMP: no need to import any class form java.lang package.
        System.out.println("Area : " + areaOfCircle); //java.lang
        BootCampStudetn btObj = new BootCampStudetn(); //same package ma vako class lai import garnu pardaina

    }

}
