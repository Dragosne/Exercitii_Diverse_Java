import java.sql.Array;
import java.sql.SQLOutput;

public class TipuriDate {
    public static void main(String[] args) {
        byte b1 = 100;
        short sh1 = 10000;
        int i1 = 100000;
        long l1 = 15000000000L;
        float f1 = 35e3f;
        double d1 = 12E4d;
        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println("Tipuri de Date in JAVA".toUpperCase());
        System.out.println("=======================");
        System.out.println();
        System.out.println("byte are valori intre -128 si 127 de ex: " + b1);
        System.out.println("short intre -32768 si 32767 de ex: " + sh1);
        System.out.println("int intre -2^63 si 2^63-1 de ex: " + i1);
        System.out.println("long e mai mare ca int: intre -2^63 si 2^63-1 de ex: " + l1);
        System.out.println("float 35e3f =" + f1);
        System.out.println("double 12E4d =" + d1);
        System.out.println("boolean: " +bo1 + " " + bo2);
        char c1 = 'A';
        char ascii1 = 65, ascii2 = 66, ascii3 = 97;
        System.out.println("char tine un caracter de ex:" + c1);
        System.out.println("sau ASCII: " + "char 65 = " + ascii1 + "char 66 = " + ascii2 + "char 97 = " + ascii3);
        String s1 = "tine caractere";
        System.out.println("String: " + s1);

    }//inchide psvm

    }//inchide clasa


