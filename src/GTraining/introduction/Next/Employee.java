package GTraining.introduction.Next;

public class Employee {

    public String id; //everywhere : visible
    private String code; //inside class

    String address; //pkg-private: afno package vitra public, accessible from same package
    protected String batch; //=pkg-private + public for inheritance class

    public String getId() {
        return this.id;
    }

    public int deposit(double amount, String accNo) {
        //deposit
        return 0;
    }


    public static void main(String[] args) {
        Employee e = new Employee();

    }
}
