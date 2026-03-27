package gun22;

import java.util.*;

public class filmArsivi {
    public static List<String> FilmListesi(String veri) {
        List<String> filmler = new ArrayList<>();

        String[] filmIsimleri = veri.split(",");

        for (String film : filmIsimleri) {
            film =  film.trim();

            if (!film.isEmpty()) {
                filmler.add(film);
            }
        }
        return filmler;
    }
    public static Set<String> benzersizFimler (List<String> filmler) {
        // (buraya List verdiğimiz zaman otomatik sete dönüştürüyor.)
        return new HashSet<>(filmler);
        /**
         * bu kullanım yukarıdaki ile aynı sonucu verir
         * set<String> benzersiz = new HashSet<>(filmler);
         * return benzersiz;
         **/
    }

    public static String kategoriBilgisi (String kod) {
        switch (kod.toUpperCase()) {
            // return ifadesi 2 şekilde kullanılır.
            //1. metodun döneceği değer, 2. si metodu o anda bitirmek için kullanılır.
            case "A":
                return "Bilim Kurgu";
                case "B":
                    return "Dram";
                    case "C":
                        return "aksiyon";
                        default:
                            return "tanımsız";
        }
    }



    public static void main(String[] args) {
        /**
         * Bir sinema uygulamasında kullanıcıdan virgülle ayrılmış şekilde
         * film isimleri alınır.
         * Örnek giriş:
         * Avatar, Inception, avatar, Interstellar, Joker, joker
         * Program şu işlemleri yapmalıdır:
         * Film isimlerini uygun şekilde parçalayarak bir koleksiyona aktarsın.
         * Tekrar eden film isimlerini temizlesin.
         * Her film adının başındaki ve sonundaki boşlukları temizlesin.
         * Kullanıcıdan ayrıca bir kategori kodu alınsın:
         * A → Bilim Kurgu
         * B → Dram
         * C → Aksiyon
         * diğer durumlar → Tanımsız
         * Bir metod film listesini düzenlesin.
         * Bir metod tekrar edenleri kaldırsın.
         * Bir metod kategori koduna göre tür açıklamasını döndürsün.
         * Son olarak ekrana temizlenmiş film listesi ve seçilen kategori yazdırılsın.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("film isimlerini aralarında virgül olacak şekilde girin: ");
        String veri = scanner.nextLine().trim().toLowerCase().toUpperCase();

        System.out.println("kategori kodu girin: (A,B,C)");
        String kod = scanner.nextLine().trim().toLowerCase().toUpperCase();

        List<String> filmler = FilmListesi(veri);

        Set<String> benzersizFilmer = benzersizFimler(filmler);

        String kategori = kategoriBilgisi(kod);

        System.out.println("Film listesi: " + filmler);
        System.out.println("benzersiz film listesi: " + benzersizFilmer);
        System.out.println("film kategorisi: " + kategori);



    }
}
