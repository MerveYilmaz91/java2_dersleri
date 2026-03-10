package gun11;

import java.util.Scanner;

public class OtobusKarti {
    public static void main(String[] args) {
        //kullanıcıdan 7 günlük harcama girilmesini iste. toplam harcamayı bul
        // Limit degeri alalım, eger limit aşılırsa uyarı verelim.

        Scanner sc = new Scanner(System.in);
        System.out.println("Haftalık limiti girin: ");
        double limit = sc.nextDouble();
        double[] gunluk = new double[7];
        double toplam = 0;

        for (int i = 0; i < gunluk.length; i++) {
            System.out.println((i + 1) + ". gun harcamasi: " );
            double input = sc.nextDouble();

            if (input < 0) {
                System.out.println("Harcama negatif olamaz");
                input = 0;

            }
            gunluk[i] = input;
            toplam += input;
        }
        System.out.println("Toplam harcama: " + toplam);

        if (toplam > limit) {
            System.out.println("limit aşıldı karta para yukleyin");
        }


    }
}
