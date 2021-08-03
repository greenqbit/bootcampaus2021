package GTraining.introduction.OOP.interf;

public class NicAsia implements Bank {

    @Override
    public String getBankName() {
        return "Nic Asia Bank";
    }

    @Override
    public void printBankName() {
        System.out.println(getBankName());
    }

    @Override
    public int getRate() {
        return 8;
    }

    @Override
    public double getDollarExRate() {
        return 115.5;
    }
}
