package GTraining.introduction.pkgimport.stud;

public class BootCampCourse {

    public void showCourse() { //anywhere
        System.out.println("BootCamp");
    }

    private void showCourse2() { //same class level(onluy inside class)
        System.out.println("BootCamp");
    }

    void showCourse3() { // (folder level)package - private => same package
        System.out.println("BootCamp");
    }

    public static void main(String[] args) {
        ////====BootCampCourse access
        BootCampCourse bCourse = new BootCampCourse();
        bCourse.showCourse(); //YES
        bCourse.showCourse2(); //YES => PRIVATE
        bCourse.showCourse3(); //Yes => this is in same package
    }
}
