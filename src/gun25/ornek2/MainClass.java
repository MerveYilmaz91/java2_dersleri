package gun25.ornek2;

public class MainClass {
    public static void main(String[] args) {

        //boş constroctor ile nesne tanımlama
        Calisan calisan1 = new Calisan();
        calisan1.isim = "hüseyin";
        calisan1.maas = 500000;
        calisan1.deparman = "yazılım";
        calisan1.isActive = true;

        //parametreli constructor kullanımları
        Calisan calisan2 = new Calisan("kader", "yazılım");
        Calisan calisan3 = new Calisan("izzet" ,500000);
        Calisan calisan4 = new Calisan("alperen", true);
        Calisan calisan5 = new Calisan("gülşah","yazılım", 57000, true);

        System.out.println("calisan1: " + calisan1);
        System.out.println("calisan2: " + calisan2);
        System.out.println("calisan3: " + calisan3);
        System.out.println("calisan4: " + calisan4);
        System.out.println("calisan5: " + calisan5);

    }

}
