package gun11;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] notlar = {95,56,45,100};

        // öğrencinin aldığı notların toplamı ve ortalamasını bulalım.

        int toplam = 0;
        for (int not: notlar) {
            toplam += not;
        }
        System.out.println("toplam not: " + toplam);
        System.out.println("Not ortalamasi: " + (toplam/notlar.length));

        System.out.println("---soru 2-------");
        int [] nums = {3,5,56,23,44,99,54};

        // nums array i içerisindeki en büyük sayıyı bulalım
         int max = nums [0]; //max degerini başlangıçta bilmiyoruz.

        /**
         * max degerini başlangıçta bilmiyoruz.
         * başlangıç degeri için arrayin ilk elemanını aldım.
         * bu sayede array içerisinde gezip sırayla diğer elemanları bu deger ile kıyaslıyorum.
         * yeni deger daha büyük ise max degeri olarak onu atıyorum
         */

         for (int i = 1; i < nums.length; i++) {
             if (nums[i] > max) {
                 max = nums[i];
             }
         }
         System.out.println("max deger: " + max);

        System.out.println("------soru3-------");

        int tekSayiMiktari = 0;
        for (int index = 0; index < nums.length; index++) {

            // bir sayının mod u 0 a eşitse bu sayı çifttir. 1 e eşitse bu sayı tektir.
            if (nums[index] %2 == 1) {
                tekSayiMiktari++;
            }
        }
        //arrayi oluştururken kaç elemanlı olduğunu belirttik.
        int [] tekSayilar = new int[tekSayiMiktari];
        int sayac = 0;

        for (int i = 0; i < nums.length; i++) {
            // yeni oluşturulan array enums arrayi içerisindeki tek sayıları ekledik.
            if (nums[i] %2 == 1) {
                tekSayilar[sayac] = nums[i];
                sayac++;
            }

        }
        //teksayılar array indeki elemanları ekrana yazdırdık.
        for (int tek: tekSayilar) {
            System.out.print(tek);
        }

        System.out.println("Toplam Tek sayi miktari: " + tekSayiMiktari);

        System.out.println("------soru4------");
        String[] cities = {"Ankara","Antalya","Istanbul","Berlin","Izmir"};
        //cities array ı içerisindeki şehirlerden kaç tanesi A harfi ile başlıyor.

        int miktari = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].startsWith("A")) {
                miktari++;
            }
        }
        System.out.println("A ile başlayan sehir sayisi: " + miktari);




    }
}
