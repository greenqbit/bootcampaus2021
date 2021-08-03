package GTraining.introduction.OOP.interf;

public class InterfaceTest {
    public static void main(String[] args) {

        Bank nabil = new Nabil(); //dynamic binding
        System.out.println(nabil.getBankName() + " " + nabil.getRate() + " " + nabil.getDollarExRate());
        nabil.printBankName();

        Bank nicAsia = new NicAsia();
        System.out.println(nicAsia.getBankName() + " " + nicAsia.getRate() + " " + nicAsia.getDollarExRate());
        nicAsia.printBankName();
    }
}
