package GTraining.introduction;

public class OperatorMain {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x++); //5
        System.out.println(x); //6

        int y = 10;
        System.out.println(++y); //11

        System.out.println(17 % 3); //2

        int z = 20;
//        z = z + 50; //70
        z += 50; // z = z + 50
        z *= 2; // z = z * 2

        //=====&&
        int sciMarks = 75;
        if (sciMarks > 0 && sciMarks <= 100) { //sciMarks > 40 and sciMarks <= 100

            // Pass or fail
            if (sciMarks >= 40) { //100% pass
                System.out.println("Ram is passed in sci");
            } else { //FAIL
                System.out.println("Ram is fail in sci");
            }
        }

        //Ternary Operator  ?  :

        int computerMarks = 50;
        boolean isPassedInComputer;
        /*
        if (computerMarks >= 40) { //true ?
            isPassedInComputer = true;
        } else { //:
            isPassedInComputer = false;
        }
        */
        isPassedInComputer = (computerMarks >= 40) ? true : false;


        System.out.println("isPassedInComputer: " + isPassedInComputer);

       // instance of
       String s = "ABC";
       if (s instanceof String) { //s is string

       }

       int i = 10; //primitive
       Integer i2 = 10; //class: non primitive data type(object)
       if (i2 instanceof Integer) { //Integer: Wrapper Class

       }

    }
}
