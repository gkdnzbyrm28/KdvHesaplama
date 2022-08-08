import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret, kdvTutar, kdvliFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Tutarini Giriniz");
        ucret = input.nextDouble();

        if (ucret <1000){

            kdvTutar = ucret * 0.18;
            kdvliFiyat = kdvTutar + ucret;
            System.out.println("Kdv'siz tutar\n"+ucret);
            System.out.println("Kdv Tutari\n"+kdvTutar);
            System.out.println("Kdv'li fiyat\n"+kdvliFiyat);
        }
        else if (ucret >=1000) {
            kdvTutar = ucret * 0.8;
            kdvliFiyat = kdvTutar + ucret;
            System.out.println("Kdv'siz tutar\n"+ucret);
            System.out.println("Kdv Tutari\n"+kdvTutar);
            System.out.println("Kdv'li fiyat\n"+kdvliFiyat);
        }
        else {
            System.out.println("Lütfen Ucret Giriniz.");
        }
    }
}

