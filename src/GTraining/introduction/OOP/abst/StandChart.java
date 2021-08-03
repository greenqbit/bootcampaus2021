package GTraining.introduction.OOP.abst;

public class StandChart extends Bank {

    @Override
    public String getBankName() {
        return "Standar Chart Bank";
    }

    @Override
    protected int getRate() {
        return 4;
    }
}
