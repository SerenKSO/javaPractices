import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km_tutarı=2.20;
        double acılıs_ücreti = 10;
        double yol;



        Scanner scan = new Scanner(System.in);

        System.out.println("Kilometre giriniz.");
        yol = scan.nextDouble();
        double tutar = acılıs_ücreti + km_tutarı*yol;

        String ücret = tutar<20.0 ? "Ücret 20 TL" : "Ücret " + tutar  ;
        System.out.println(ücret);
    }
}
