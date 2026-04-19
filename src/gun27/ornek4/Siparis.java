package gun27.ornek4;

import gun21.SinavOrtalamasi;

public class Siparis {

    private String musteriAdi;
    private MenuTuru menuTuru;

    public Siparis(String musteriAdi, MenuTuru menuTuru) {
        this.musteriAdi = musteriAdi;
        this.menuTuru = menuTuru;
    }

    public void siparisDetayi () {
        System.out.println("Müşteri adı: " + musteriAdi);
        switch (menuTuru) {
            case CORBA -> System.out.println("secim: mercimek çorbası");
            case ANAYEMEK -> System.out.println("seçim: karışık ızgara");
            case TATLI -> System.out.println("seçim: kadayıf dolması");
        }
    }
}
