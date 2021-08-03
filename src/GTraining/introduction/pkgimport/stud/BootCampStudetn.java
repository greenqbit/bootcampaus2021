package GTraining.introduction.pkgimport.stud;

public class BootCampStudetn {

    public static void main(String[] args) {

        ////====BootCampCourse access
        BootCampCourse bCourse = new BootCampCourse();
        bCourse.showCourse();
        //bCourse.showCourse2(); //X => PRIVATE
        bCourse.showCourse3(); //Yes => this is in same package
    }
}
