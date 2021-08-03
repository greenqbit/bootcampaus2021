package GTraining.introduction.OOP.abst;

public class NicAsia extends Bank {

    @Override
    public String getBankName() {
        return "Nic Asia Bank";
    }

    @Override
    protected int getRate() {
        return 10;
    }
}
