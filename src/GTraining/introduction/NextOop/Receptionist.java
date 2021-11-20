package GTraining.introduction.NextOop;

import GTraining.introduction.Next.Bike;
import GTraining.introduction.Next.Employee;

public class Receptionist  extends Employee {
//inheritance

    public void showAttr() {
        Receptionist e = new Receptionist();
        System.out.println(e.id);
        System.out.println(e.batch);
    }


    public static void main(String[] args) {
        Bike bike = new Bike();

    }

}
