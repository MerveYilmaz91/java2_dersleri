package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek2 {
    public static void main(String[] args) {
        /**
         * Bir kargonun teslim edilmesi gereken zaman 26 Nisan 2026 18:00 olsun.
         * Gerçek teslim zamanı ise 26 Nisan 2026 20:15 olsun.
         * Program, kargonun geç teslim edilip edilmediğini kontrol etsin.
         **/

        LocalDateTime planlananTeslimZamani = LocalDateTime.of(2026, 04, 26, 18, 00);
        LocalDateTime gercekTeslimZamani = LocalDateTime.of(2026, 04, 26, 20, 15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm");

        System.out.println("planlanan teslim zamanı: " + planlananTeslimZamani.format(formatter));
        System.out.println("gerçek teslim saati: " + gercekTeslimZamani.format(formatter));

        if (gercekTeslimZamani.isAfter(planlananTeslimZamani)) {
            System.out.println("kargo geç teslim edilmiştir.");
        } else {
            System.out.println("kargo geç teslim edilmiştir.");
        }
    }
}
