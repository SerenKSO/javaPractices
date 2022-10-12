import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int dik1, dik2, hipo;

        Scanner scan = new Scanner(System.in);

        System.out.println("İlk dik kenar uzunluğunu giriniz");
        dik1= scan.nextInt();

        System.out.println("İkinci dik kenar uzunluğunu giriniz");
        dik2= scan.nextInt();

        hipo = (int)(Math.sqrt(dik1*dik1 + dik2*dik2));
        System.out.println("Hipotenus uzunluğu: "+hipo);

        int alan = (dik1*dik2)/2;
        System.out.println("Alan: "+ alan);
    }
}
