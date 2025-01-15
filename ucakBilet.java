import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, yas, tip;
        double tutar = 0, itutar = 0, Ytutar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km uçacağınızı giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Nasıl Uçacağınızı giriniz 1-tek yön/2-gidiş dönüş: ");
        tip = input.nextInt();
        tutar = km * 0.10;

        if (yas < 12) {
            Ytutar = tutar / 2;

        } else if (yas > 12 && yas < 24) {
            Ytutar =  tutar / 10;
        } else if (yas > 65) {
            Ytutar = tutar / 4;
        } else {
            Ytutar = tutar;
        }

        itutar = tutar-Ytutar;


        if (tip == 1) {
            tutar = tutar*1;

        } else if (tip == 2) {
            tutar =itutar*0.20;
        } else {
            System.out.println("yanlış uçuş tipi girdiniz tekrar giriniz:");
            tip = input.nextInt();
        }
        System.out.println(itutar);


    }
}
