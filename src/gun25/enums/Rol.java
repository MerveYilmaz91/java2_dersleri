package gun25.enums;

public enum Rol {
    OGRETMEN, OGRENCİ,MUDUR;

    //enum içerisinde method tanımlayabiliriz.
    //buradaki this kavramı: enum ın field leridir.
    public void yetkiYazdir() {
        switch (this) {
            case MUDUR -> System.out.println("tüm sistemi kontrol eder");
            case OGRETMEN -> System.out.println("ders ekler ve not verir");
            case OGRENCİ -> System.out.println("derse girer");
        }
    }
}
