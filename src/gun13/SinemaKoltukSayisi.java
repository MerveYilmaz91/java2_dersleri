package gun13;

import java.util.Scanner;

public class SinemaKoltukSayisi {
    public static void main(String[] args) {
        /** sinema salonunda 4 sıra, her sırada 5 koltuk var.
         * kullanıcı 0/1 girerek koltuk durumlarını doldursun.
         * 0 = boş
         * 1 = dolu
         * istenenler:
         * toplam dolu koltuk sayısını yazdır.
         * en çok dolu olan sırayı yazdır.
         * eger toplam doluluk %70 ve üstü ise "salon dolu sayılır" mesajı ver.
         **/

        Scanner scanner = new Scanner(System.in);

        int sira = 4;
        int koltuk = 5;

        int [][] salon = new int [sira][koltuk];

        System.out.println("koltuk durumlarını girin(0 -> bos, 1 -> dolu)");
        for(int i = 0; i < salon.length; i++){
            System.out.println((i+1) + " sıra için girdi yapın ");
            for(int j = 0; j < salon[i].length; j++){
                System.out.println((j+1) + ". koltuk: ");
                int durum = scanner.nextInt();

                while(durum != 0 && durum != 1){    //0 yada 1 girmezse
                    System.out.println("hatalı giriş yaptınız. 0 yada 1 degeri girin");
                    durum = scanner.nextInt();
                }
                salon[i][j] = durum;
            }
        }

        int toplamDoluKoltuk = 0;
        int enDoluSiraİndex = -1;   //0 olursa 1. sırayı en dolu sıra kaydetmiş olur.
        int enDoluSira= 0;

        for(int i = 0; i < salon.length; i++){   //sıra
            int dolulukMiktari = 0;    //bu sıradaki dolu koltuklar
            for(int j = 0; j < salon[i].length; j++){  //koltuk
                if(salon[i][j] == 1){    //dolu koltuk aradığımız için == 1 yaptık
                    toplamDoluKoltuk++;
                    dolulukMiktari++;
                }

                // sıra hala aynı, koltukların durumu bitti.
                //dış döngü içindeyiz, ama iç döngü bitti.

                if (dolulukMiktari > enDoluSira){
                    enDoluSira = dolulukMiktari;
                    enDoluSiraİndex = i;
                }
            }

            System.out.println("-----sonuçlar------");
            System.out.println("toplam dolu koltuk sayısı: " + toplamDoluKoltuk);
            System.out.println("en dolu sıra: " + (enDoluSiraİndex + 1)+ "doluluk miktarı: " + enDoluSira);
            // 1 sıradaki doluluk miktarı mesela 3, doluluk miktarı 5 gibi....
            // index 0 dan başladığı için + 1 ekledik.

            int toplamKoltukSayisi = sira * koltuk;
            double dolulukYuzdesi = (double) toplamDoluKoltuk / toplamKoltukSayisi;

            System.out.println("dolulukYuzdesi: " + dolulukYuzdesi);

            if (dolulukYuzdesi >= 70){
                System.out.println("salon dolu sayılır.");
            }









        }








    }
}
