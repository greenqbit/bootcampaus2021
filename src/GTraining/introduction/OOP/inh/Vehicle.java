package GTraining.introduction.OOP.inh;

//OOP

/**
 * 1. Class
 * 2. Object
 * 3. this, static, final
 * 4. constructor
 *
 *
 * 5. TODO: Inheritance => going to read (parent child relationship)
 * 6. Polymorphism => only for the method
 */
public class Vehicle { //Parent: common for all the vehicle => Parent

    private String color;
    public int speed;
    protected int size; //protected : package private + child class
//    protected int gears;

    protected void attributes() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Size: " + size);
    }

}
