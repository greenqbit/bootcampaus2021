package GTraining.introduction.OOP.abst;

//Abastracdtion
//1. Abstract class => class
//2. Interface ==> interface
//abstract = incomplete
public abstract class Bank {//Nepal Rastra Bank, 0, 100: 66 incomplete, 33 complete
    public abstract String getBankName(); //incomplete

    protected abstract int getRate(); //incomplete

    protected double getDollarExRate() { //complete
        //world wide api, security, login, access, payment.
        return 115.5;
    }

}
