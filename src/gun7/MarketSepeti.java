package gun7;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        double fiyat ;

        do {
            System.out.println("ürün fiyati girin(Çıkış yapmak için 0 girin): " );
            fiyat = scanner.nextDouble();

            if (fiyat > 0){
                toplam += fiyat;
            } else if (fiyat < 0) {
                System.out.println("Fiyat negatif sayı olamaz");
            }

        } while (fiyat != 0);

        System.out.println("Toplam: " + toplam);




    }
}
