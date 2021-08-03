package GTraining.introduction.OOP.inh;

//public class Car extends Vehicle, Human => multiple inheritance
// Java doesn't support it
public class Car extends Vehicle { //Child(extends inheritance)

    private int cc;
    private int gears;

    @Override
    public void attributes() {
        super.attributes();
        System.out.println("CC: " + this.cc);
        System.out.println("Car Gears: " + this.gears);
//        System.out.println("Vehicle Gears: " + super.gears);
    }

    public static void main(String[] args) {
        Car honda = new Car();
//        honda.color = "RED";
        honda.speed = 90;
        honda.size = 5;
        honda.cc = 1700;
        honda.gears = 4;

        honda.attributes();//3



        Car toyota = new Car();

    }


}
