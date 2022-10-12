import java.util.Scanner;

public class ManavHesap {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan= 5.0;
        double tutar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        int a = scan.nextInt();

        System.out.println("Elma Kaç Kilo ? :");
        int e = scan.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        int d = scan.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        int m = scan.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        int p = scan.nextInt();


        tutar = a*armut+e*elma+d*domates+m*muz+p*patlıcan;
        System.out.println(tutar);

    }
}
