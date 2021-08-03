package GTraining.introduction.pkgimport.course;

public class Course {

    //property
    private String firstName = null; //Class variable/object variable/instance variable/class property
    private String lastName = null;
    private int rollNo;

    private static final double PI = 3.15; //intance variable
    public static final int DAYS = 365; //COMMON -> static, CONSTANT => final keyword

    public Course() {

    }

    public Course(String firstName, String lastName, int rNo) { //scope
        this.firstName = firstName; //this = > Object ko something
        this.lastName = lastName;
        rollNo = rNo;
    }

    void showCourse() { //no public/ no private (
        int x = 10; //local variable
        System.out.println("Course is BootCamp Java" + x);//local
//        PI = 5.5;
//        DAYS = 900;

        System.out.println(this.firstName + " " + this.lastName + " " + this.rollNo + "  " + PI + " " + DAYS); //automatically -> this. (added by compiler)

    }

    public int square(final int x) {
         //x = 10; //WRONG
         return x * x;
    }

    public static void main(String[] args) {
        Course sumC = new Course("Suman", "Chaudhari", 1); //Object created; where Course() => Constructor
        sumC.showCourse();
        sumC.showCourse();

        Course erinK = new Course( "Erin", "Karki", 2); //Object created; where Course() => Constructor
        erinK.showCourse();

        System.out.println(Course.DAYS);
        System.out.println(DAYS); //because we are in the same class, otherwise Classname.inner

        System.out.println(erinK.DAYS); //Object . => every thing we can access ( either static or non static)


    }



}
