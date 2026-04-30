package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ornek3 {
    public static void main(String[] args) {
        /**
         * Bir etkinlik 27 Nisan 2026 19:30’da başlayacak.
         * Program, etkinlikten 1 saat önceki hatırlatma zamanını hesaplayıp yazdırsın.
         **/

        LocalDateTime etkinlikZamani = LocalDateTime.of(2026, 04, 27, 19, 30);

        LocalDateTime hatirlatmaZamani = etkinlikZamani.minusMinutes(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("etkinlik zamanı: " + etkinlikZamani.format(formatter));
        System.out.println("hatırlatma zamanı: " + hatirlatmaZamani.format(formatter));
    }

}
