package YMH115;

public class JavaOrnekleri {

    /*

   * 1-) Aşağıdaki ifadenin sonucunu hesaplayınız. b3 arttırma azaltma
    int sayi1 = 10;
    int sayi2 = ++sayi1;
    int sayi3 = sayi1--;
System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++));

  *  2-)  Aşağıdaki ifadenin vereceği çıktıyı hesaplayınız. b3 aritmetik atama
         double ondalikliSayi=6.50;
         double sonuc = 0;
         sonuc++;
         ondalikliSayi *= sonuc;
         System.out.println("Sonuç : " + sonuc);

    3-) Aşağıdaki ifadenin sonucunu hesaplayınız.
    int s1 = 10;
    int s2 = 6;
    s1++;
    --s2;
    s1 *= --s2;
    System.out.println("s1 in son değeri:");
    System.out.println("s2 nin son değeri:");

    3-2) Aşağıdaki sonuc degiskenine atanacak değerleri sırasıyla hesaplayınız.b3 işlem önceliği
        int sayi1=15;
        int sayi2 = 5;
        int sonuc = 0;
        sonuc = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1
        sonuc = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1

    4-) Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun. b3 ödev
        Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
        Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.

    5-) Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı saklayın. b3 ödev
        Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
        100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
        Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)

    6-) Bir yıl değerinin artık yıl olup olmadığını hesaplayın. b3 ödev
        Bir yılın artık olması için ya 400 ile modu 0 olmalı yada 4 ile modu 0 olmalı
        e 100 ile modu 0 olmamalı
        4100 false değer vermeli.

    7-) Kullanıcıdan aldığınız değerlere göre vücut kitle endeksini hesaplayınız. b4 bölüm sonu
        Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)

    8-) Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.b5

    9-) Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların b5
        çarpımını sonuç olarak gösteren programı yazınız.

    10-) 1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız. b5
     */
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;
        System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++));
    }



}
