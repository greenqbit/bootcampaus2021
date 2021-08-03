package GTraining.introduction.pkgimport.course;

import GTraining.introduction.pkgimport.stud.BootCampCourse;

public class Constants {

//    Course sumC = new Course("Suman", "Chaudhari", 1); //Object created; where Course() => Constructor
//        sumC.showCourse();
//        sumC.showCourse();
//
//    Course erinK = new Course("Erin", "Karki", 2); //Object created; where Course() => Constructor
//        erinK.showCourse();
//
//        System.out.println(Course.DAYS);
////  X       System.out.println(DAYS); //because we are in the same class, otherwise Classname.inner
//
//        System.out.println(erinK.DAYS); //Object . => every thing we can access ( either static or non static)


    public static void main(String[] args) {

        ////====BootCampCourse access
        BootCampCourse bCourse = new BootCampCourse();
        bCourse.showCourse();
        //bCourse.showCourse2(); //X => PRIVATE
        //bCourse.showCourse3(); //X => this is different package
    }



}

