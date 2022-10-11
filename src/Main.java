import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tr, mat, fiz, kim, mzk, trh;


        Scanner scan = new Scanner(System.in);

        System.out.println("Tr notunuzu giriniz.");
        tr = scan.nextInt();

        System.out.println("Mat notunuzu giriniz.");
        mat = scan.nextInt();

        System.out.println("Fiz notunuzu giriniz.");
        fiz = scan.nextInt();

        System.out.println("Kim notunuzu giriniz.");
        kim = scan.nextInt();

        System.out.println("Mzk notunuzu giriniz.");
        mzk = scan.nextInt();

        System.out.println("Trh notunuzu giriniz.");
        trh = scan.nextInt();

        int avr = (tr+ mat+ fiz+ kim+ mzk+ trh)/6;
        System.out.println("Ortalama: " + avr);

        String str = avr > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);





    }
}