import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);

        System.out.println("ilk sayı lütfen");
        n1= scan.nextInt();

        System.out.println("ikinci sayı lütfen");
        n2= scan.nextInt();

        System.out.println("Yapacağınız işlemi seçiniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select= scan.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1+n2);
                break;

            case 2:
                System.out.println(n1-n2);
                break;

            case 3:
                System.out.println(n1*n2);
                break;

            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hata");




        }
    }
}
