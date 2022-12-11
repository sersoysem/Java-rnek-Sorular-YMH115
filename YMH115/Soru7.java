package YMH115;
/*
Bir yıl değerinin artık yıl olup olmadığını hesaplayınız.
bir yılın artık yıl olması için 400 ile veya 4 ile modu 0 olmalıdır.
100 ile moodu 0 olmamalıdır.
4100 değeri için false değerini vermelidir.
 */

public class Soru7 {
    public static void main(String[] args) {
        int yil = 4100;
        boolean artikYilMi = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0);
        System.out.println("Girilen " + yil + " yılı artık yıldır : " + artikYilMi);
    }
}