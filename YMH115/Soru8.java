package YMH115;
/*
Girilen bir daire yarı çapına ait alan ve çevre hesaplamalarını yapan bir program yapınız.
Alan Hesap Formülü = pi*yariCap*yariCap
Çevre Hesap Formülü = 2*pi*yariCap
 */

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        System.out.println("Yarı Çap Giriniz: ");
        Scanner girilensayi= new Scanner(System.in);
        double yariCap = girilensayi.nextDouble();
        double pi = 3.14;
        double cevre = 2*pi*yariCap;
        double alan = pi*yariCap*yariCap;
        System.out.println("Dairenin Alanı =" + alan);
        System.out.println("Dairenin Çevresi =" + cevre);

    }
}
