package GTraining.introduction.OOP.abst;

public class AbsClassTest {

    public static void main(String[] args) {

//        Bank b = new Bank(); //Can't make obj of abstract class

        //WE can make obj of child class
        NicAsia nicAsia = new NicAsia(); //compile time/static binding
        System.out.println(nicAsia.getBankName() + " " + nicAsia.getRate() + " " + nicAsia.getDollarExRate());

//        String n = nicAsia.getBankName();
//        System.out.println(n);

        Nabil nabil  = new Nabil();
        System.out.println(nabil.getBankName() + " " + nabil.getRate() + " " + nabil.getDollarExRate());


        StandChart stadnChart  = new StandChart();
        System.out.println(stadnChart.getBankName() + " " + stadnChart.getRate() + " " + stadnChart.getDollarExRate());


        //======Runtime/Dynamic Binding ===Part of escapsulation
        System.out.println("===Dynamic Binding=====");
        Bank nicAs = new NicAsia(); //Child class Object can be hold by parent class reference
        System.out.println(nicAs.getBankName() + " " + nicAs.getRate() + " " + nicAs.getDollarExRate());

        Bank nbl = new Nabil();
        System.out.println(nbl.getBankName() + " " + nbl.getRate() + " " + nbl.getDollarExRate());

        Bank stadCht = new StandChart();
        System.out.println(stadCht.getBankName() + " " + stadCht.getRate() + " " + stadCht.getDollarExRate());
    }
}
