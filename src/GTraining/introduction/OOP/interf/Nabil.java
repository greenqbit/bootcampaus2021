package GTraining.introduction.OOP.interf;

public class Nabil implements Bank {

    @Override
    public String getBankName() {
        return "Nabil Bank";
    }

    @Override
    public void printBankName() {
        System.out.println("Nabil Bank");
    }

    @Override
    public int getRate() {
        return 6;
    }

    @Override
    public double getDollarExRate() {
        return 115.5;
    }
}
