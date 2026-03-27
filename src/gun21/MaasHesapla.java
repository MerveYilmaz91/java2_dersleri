package gun21;

public class MaasHesapla {
    public static void maasHesapla (int saat, int saatlikUcret) {
        System.out.println("çalışan maaşı: " + (saat *  saatlikUcret));

    }
    public static void calisanBilgisiniYazdir (String isim, String bolum, int saat, int saatUcreti) {
        System.out.println("---- çalışan özeti----");
        System.out.println("çalışan ismi: " + isim);
        System.out.println("çalışan bölümü: " + bolum);
        System.out.println("çalışan saatlik ücreti: " + saatUcreti);
        maasHesapla(saat, saatUcreti);
        // geri dönüş tipi void olan bir metodu, direkt sout içinde kullanamayız.
        //System.out.println("toplam maas" + maasHesapla(saat,saatUcreti);
    }

    public static void main(String[] args) {

        //isim-bölüm-aylık çalışma saati-saatlik ücreti
        calisanBilgisiniYazdir("merve", "ISG", 160,300);
        calisanBilgisiniYazdir("serdar", "insaat", 150,320);
        calisanBilgisiniYazdir("asya", "doktor", 130,350);
        calisanBilgisiniYazdir("deren", "öğretmen", 100,350);

    }
}
