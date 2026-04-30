package gun36;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeKonusu {
    public static void main(String[] args) {
        /**
         * localDateTime -> tarih ve saat bilgilerini tutabiliyoruz.
         * 21.04.2026 ve 18:14 bilgisini tutar.
         * yıl, ay,gün, saat,dk, sn nanosaniye
         * zaman dilimlerini tutmaz yani berlin veya ist saati bilgisini tutmaz.
         *
         * nerede kullanılır:
         * randevu, sipariş, sınav başlangıç zamanı, rezervasyon, etkinlik uygulamalarında kullanılır.
         **/

        //şuanki tarih ve saat bilgilerini verir her çalıştırıldığında sonuç değişir.

        LocalDateTime simdi = LocalDateTime.now();
        System.out.println("şimdinin tarih ve saati: " + simdi);
        System.out.println("yıl: " + simdi.getYear());
        System.out.println("ay: " + simdi.getMonthValue());
        System.out.println("gün: " + simdi.getDayOfMonth());
        System.out.println("saat: " + simdi.getHour());
        System.out.println("dakika: " + simdi.getMinute());



        //istenilen bir tarih saat ataması
        LocalDateTime tarihSaat = LocalDateTime.of(2026,5,10,10,00);
        System.out.println("belirlenen tarih ve saat" + tarihSaat);

        //bu sadece tarih bilgisini tutar.
        LocalDate date = LocalDate.now();
        System.out.println("tarih: " + date);

        //sadece zamanı tutar
        LocalTime time = LocalTime.now();
        System.out.println("saat: " + time);


        //gün ekleme
        LocalDateTime yeniTarih = simdi.plusDays(2);
        System.out.println("yeni tarih: " + yeniTarih);

        //saat ekleme
        LocalDateTime yeniSaat = simdi.plusHours(3);
        System.out.println("yeni saat: " + yeniSaat);

        //dakika çıkarma
        LocalDateTime yeniDakika = simdi.minusMinutes(30);
        System.out.println("yeni dakika: " + yeniDakika);

        /**
         * plusDays()
         * plusMonths()
         * plusYears()
         * plusHours()
         * plusMinutes()
         *
         * minusDays()
         * minusHours()
         * minusMinutes()
         **/

        LocalDateTime t1 = LocalDateTime.of(2026,4,21,18,23);
        LocalDateTime t2 = LocalDateTime.of(2026,6,23,11,25);

        System.out.println("t1 t2 den önce mi" + t1.isBefore(t2));
        System.out.println("t1 t2 den sonra mı" + t1.isAfter(t2));
        System.out.println("t1 ve t2 eşit mi" + t1.equals(t2));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String sonuc = simdi.format(formatter);
        System.out.println("formatlı şimdi: " + sonuc);

        /**
         * Kullanilabilecek format yapilari

         * dd/MM/yyyy HH:mm
         * dd.MM.yyyy
         * HH:mm:ss
         * yyyy-MM-dd HH:mm
         * */

        String data = "20.04.2020 12:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(data, formatter);
        System.out.println("String verisini localdatetime a dönüstürme: " + localDateTime);




    }
}
