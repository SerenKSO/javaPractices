import java.util.Scanner;

public class vkiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner scan =new Scanner(System.in);
        System.out.println(" Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextDouble();

        System.out.println(" Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        vki = kilo / (boy * boy) ;
        System.out.println(" Vücut Kitle İndeksiniz : " + vki);




    }
}
