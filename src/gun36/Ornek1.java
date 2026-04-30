package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek1 {
    public static void main(String[] args) {
        /**
         * bir hastanın randevusu 25 Nisan 2026
         * Saat 14:30 olarak oluşturuluyor.
         * program bu randevu zamanını ekrana yazdırsın.
         **/

        LocalDateTime randevu = LocalDateTime.of(2025,04,25, 14,30 );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm");

        System.out.println("randevu zamanı " + randevu.format(formatter));

    }
}
