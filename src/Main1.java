import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double tutar,  kdvli_fiyat, kdv_tutarı;
        double kdv_oran=0.18;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tutar giriniz.");
        tutar= scan.nextDouble();

        kdv_tutarı = tutar * kdv_oran;
        kdvli_fiyat = tutar + kdv_tutarı;

        System.out.println("KDV TUTARI: "+ kdv_tutarı);
        System.out.println("KDV DAHİL FİYAT:"+ kdvli_fiyat);

        }
    }
