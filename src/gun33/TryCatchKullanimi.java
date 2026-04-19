package gun33;

import java.util.Scanner;

public class TryCatchKullanimi {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.println("2. sayı: ");
        int sayi2 = scanner.nextInt();

        try {
            int sonuc = sayi1 / sayi2;                 // hata oluşabilecek kod bloğu yazılır.
            System.out.println("sonuç:" + sonuc);
        } catch (ArithmeticException e) {              // try blogunda hata olursa catch blogı çalışır
            System.out.println("sayı 0 a bölünemez");
        }finally {  //bu bölüm her iki durumdada çalışır. hata olsada olmasada
            System.out.println("bu blok her iki durumdada çalışır.");
            scanner.close();
        }

        System.out.println("---------");

        try {
            String text = null;
            System.out.println("text in uzunluğu: " + text.length());
        } catch (ArithmeticException e) {
            System.out.println("matematiksel bir hata oluştu.");
        }catch (NullPointerException e) {
            System.out.println("Null bir değer üzerinden işlem yapılamaz.");
        }

        /**
         * ArithmeticException, NullPointerException vb.
         * hatayı yakalayan nesnelerdir.
         * e bir değişken ismi
         e.getMessage();
         e.printStackTrace();
         e.toString();
         **/


        /**
         * javada exceptionlar kalıtım yoluyla düzenlenmiştir.
         * en üstte Throwable vardır
         * onun altında exception vardır
         * onunda altında özel exception classları vardır.
         **/

    }
}
