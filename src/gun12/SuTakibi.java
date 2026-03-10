package gun12;

import java.util.Scanner;

public class SuTakibi {
    public static void main(String[] args) {
        /** kullanıcıdan 7 gün için (pzt...paz) günük içtiği su miktarını (litre) alın.
         * en sonda:
         * toplam su miktarını yazdırın.
         * ortalama su miktarını yazdırın.
         * hangi günler ortalamanın altında kaldıysa gün adını yazdırın.
         * ek olarak kullanıcıdan hedef litre alın ve hedefe göre "az /ideal/fazla" mesajı verin.
         **/

        Scanner scanner = new Scanner(System.in);

        // günleri array şeklinde tanımla.
        String [] days = {"Pazartesi","Sali","Carşamba","Persembe","Cuma","Cumartesi","Pazar"};

        // küsürlü çıkabilir double kullanacağız

        double [] su = new double[7];  //7 gün olduğu için 7 gün alacağız.


        // her gün için kullancıdan su miktarı aldık
        for (int i=0; i< days.length; i++){
            System.out.println(days[i] + " su miktarı: ");
            su[i] = scanner.nextDouble();
        }
        double toplam = 0;
        for (int index =0; index<su.length; index++){
            toplam += su[index];               //toplam su mikarını buluyoruz
        }

        double ortalama = toplam / su.length;
        System.out.println("Toplam su miktarı: " + toplam);
        System.out.println("ortalama su mikarı: " + ortalama);

        System.out.println("----ortalamanın altında kalan günler----");

        for (int i=0; i<su.length; i++){
            if (su[i] < ortalama){
                System.out.println(days[i] + "günü" + su[i] + "ortalamanın altında kaldı");

            }

        }
        System.out.println("hedef litre miktarı girin: ");
        double hedef = scanner.nextDouble();

        for (int i=0; i<days.length; i++){
            if (su[i] < hedef ){
                System.out.println(days[i] + "günü hedefe göre az");

            } else if (su[i]== hedef) {
                System.out.println(days[i] + "günü hedefe uygun");

            }else {
                System.out.println(days[i] + "günü hedeften fazla");

            }
        }
    }
}
