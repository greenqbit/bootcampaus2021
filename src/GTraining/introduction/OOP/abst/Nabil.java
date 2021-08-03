package GTraining.introduction.OOP.abst;

//Complete
public class Nabil extends Bank {

    @Override
    public String getBankName() {
        return "Nabil Bank";
    }

    @Override
    protected int getRate() {
        return 6;
    }

}
