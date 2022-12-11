package YMH115;
/*
Klavyeden kenarları girilen bir üçgenin çeşidini veren programı yazınız.
 */

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz : ");
        int birinciKenar = tara.nextInt();

        System.out.println("İkinci kenarı giriniz : ");
        int ikinciKenar = tara.nextInt();

        System.out.println("Üçüncü kenarı giriniz : ");
        int ucuncuKenar = tara.nextInt();

        if ((birinciKenar == ikinciKenar) && (birinciKenar == ucuncuKenar)) {
            System.out.println(" Eşkenar Üçgen");
        } else if ((birinciKenar != ikinciKenar) && (birinciKenar != ucuncuKenar) && ( ikinciKenar!= ucuncuKenar)){
        System.out.println("Çeşit Kenar Üçgen");
        }else{
            System.out.println("İkiz Kenar Üçgen");
        }

    }

}
