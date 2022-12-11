package YMH115;
    /*
Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
 Ör: 10 sayıyısı için ekranda 2, 3, 5 ve 7 değerleri olmalıdır.
 */
import java.util.Scanner;
    public class Soru10 {
        public static void main(String[] args) {

            Scanner tara = new Scanner(System.in);
            System.out.println("Üst sınırı giriniz : ");
            int girilenSayi = tara.nextInt();

            for(int i =2; i<=girilenSayi; i++){

                boolean asalMi=true;

                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        asalMi = false;
                        break;
                    }
                }
                if(asalMi)
                    System.out.print(i+",");
            }
        }
    }