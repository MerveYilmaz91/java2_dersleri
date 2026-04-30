package gun36.burger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BurgerSiparis {

    String musteriAdi;
    BurgerBoyut boyut;
    BurgerTuru turu;
    Icecek icecek;
    int adet;
    LocalDateTime siparisZamani;

    public BurgerSiparis(String musteriAdi, BurgerBoyut boyut, BurgerTuru turu, Icecek icecek, int adet) {
        this.musteriAdi = musteriAdi;
        this.boyut = boyut;
        this.turu = turu;
        this.icecek = icecek;
        this.adet = adet;
        this.siparisZamani = LocalDateTime.now();
    }
    public double burgerBirimFiyatGetir() {
        switch (boyut) {
            case KUCUK -> {
                return 80;
            } case ORTA -> {
                return 100;
            }case BUYUK -> {
                return 120;
            }default -> {
                return 0;
            }
        }
    }
    public double icecekBirimFiyatGetir() {
        switch (icecek) {
            case SU -> {
                return 10;
            }case AYRAN -> {
                return 15;
            }case KOLA -> {
                return 20;
            }default -> {
                return 0;
            }
        }
    }
    public double araToplamHesapla() {
        return (burgerBirimFiyatGetir() *adet) + (icecekBirimFiyatGetir()*adet);
    }
    public double indirimOrani() {
        if(adet >= 3) {
            return 0.1;
        }else {
            return 0;
        }
    }
    public double indirimHesapla() {
        return araToplamHesapla() * indirimOrani();
    }
    public double toplamFiyatHesapla() {
        return araToplamHesapla() - indirimHesapla();
    }
    public void siparisBilgileri() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("müşteri adı: " + musteriAdi);
        System.out.println("burger boyutu: " + boyut);
        System.out.println("burger türü: " + turu);
        System.out.println("sipariş zamanı: " + siparisZamani.format(formatter));
        System.out.println("sipariş adedi: " + adet);
        System.out.println("toplam fiyat: " + toplamFiyatHesapla());
        System.out.println();
        System.out.println("siparisiniz alındı.");
    }

}
