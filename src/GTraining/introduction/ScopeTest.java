package GTraining.introduction;

public class ScopeTest {

    public static void main(String[] args) {

        //boolean
        double mathMarks = 80.5;

        boolean passedInMath = mathMarks > 35; //true/false

        if (passedInMath) { //true
            System.out.println(" Passed in math: " + mathMarks);
        }
            if (passedInMath == true) { //true
                System.out.println(" Passed in math: " + mathMarks);

            }
        boolean isEvenNo = 20 % 2 == 0;
        System.out.println("20 is Even: " + isEvenNo);




        int x;

        x = 20;
        System.out.println("X: " + x);

        if (x == 10) { //true: compare ==
            int y = 20;
            System.out.println("X and Y: " + x + " " + y);
//            System.out.println("X and Y: " + x + y);
//            System.out.println("X and Y: " + (x + y));
//            System.out.println(x + y);

            x = y * 2;
        }

        System.out.println("X is: " + x);

    }
}
