package YMH115;
/*
Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı saklayın.
Sonrasında bu değerin kaç celcius olduğunu hesaplayın.
100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
Hesaplama formülü: celcius = 5/9*(fahrenheit -32)
 */
public class Soru6 {
    public static void main(String[] args) {
        double fahrenheit = 100;
        double celcius = (5d/9d)*(fahrenheit - 32);
        System.out.println("Girilen " + fahrenheit + "fahrenheit" + celcius + "celciustur.");

    }
}
