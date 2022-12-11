package YMH115;
/*
Aşağıdaki ifadenin sonucunu hesaplayınız.
   */

public class Soru1 {
    public static void main(String[] args) {
    int sayi1 = 20;
    int sayi2 = ++sayi1;
    int sayi3 = sayi1--;
   System.out.println("sonuc:" + ((sayi1) + (--sayi2) + (sayi3++)));
}
}