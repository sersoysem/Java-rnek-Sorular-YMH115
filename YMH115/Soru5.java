package YMH115;
/*
Bir integer değişkeni oluşturun ve bu değişkende saniye değerini tutun.
Daha sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın.
*/
public class Soru5 {
    public static void main(String[] args) {
    int saniye = 1250;
    int dakika = saniye/60;
    int kalanSaniye = saniye % 60;
        System.out.println("Girdiğiniz " + saniye + " saniye " + dakika + " dakikaya ve " + kalanSaniye + " saniyeye eşittir. ");
    }
}
