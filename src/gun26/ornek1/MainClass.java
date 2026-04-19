package gun26.ornek1;

public class MainClass {
    public static void main (String[] args) {

        Ogrenci ogrenci = new Ogrenci();

        ogrenci.setYas(-11);
        ogrenci.setIsim("ahmet");

        System.out.println("yas: " + ogrenci.getYas());
        System.out.println("isim: " + ogrenci.getIsim());
    }
}
