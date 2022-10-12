import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double yariçap, alan, çevre;
        double pi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçap giriniz.");
        yariçap= scan.nextDouble();

        alan = pi*yariçap*yariçap;
        çevre = 2*pi*yariçap;

        System.out.println("Alan:" + alan);
        System.out.println("Çevre: " + çevre);

    }
}
