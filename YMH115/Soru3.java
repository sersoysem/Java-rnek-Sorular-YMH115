package YMH115;
/*
Aşağıdaki değişkenlerin son değerlerini hesaplayınız.
*/
public class Soru3 {
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 6;
        s1++;
        --s2;
        s1 *= --s2;
        System.out.println("s1'in son değeri : " + s1);
        System.out.println("s2'nin son değeri : " + s2);

    }
}
