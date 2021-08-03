package GTraining.introduction;

public class StringTest {

    public static void main(String[] args) {

        String s = "JAVA"; //WRONG but right => Because compile can wrap it
        String s2 = new String("JAVA"); //Right =======> THIS IS
        char[] s1 = { 'J', 'A', 'V', 'A' }; //Internally

        //String is immutable: costant, never update but always created a new one
        String s3 = "BOOTCAMP"; //Its Object ( X not a value)
        String s4 = s3.toLowerCase();//bootcamp
        String s5 = s3.concat(s4); //BOOTCAMPbootcamp
        System.out.println(s3 + " " + s4);
        System.out.println("S5: " + s5);

        String s6 = "BOOTCAMP";

        String s55 = s3 + s4; //is same as .concat BOOTCAMPbootcamp
        String re = "This" + "IS " + "A Java " + " ClSSS"; //To join big string , or sententace

        //String Builder
        StringBuilder sb = new StringBuilder();
        sb.append("This ");
        sb.append("IS ");
        sb.append("A JAva ");
        sb.append("Class");
        String sbStr = sb.toString();
        System.out.println(sbStr);

    }

}
