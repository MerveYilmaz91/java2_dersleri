package gun22;

import java.util.*;

public class KelimeAnalizAraci {
    public static List<String> kelimelereAyir(String veri) {
        List<String> kelimeler = new ArrayList<>();

        String[] parcalar = veri.split(" ");
        for (String parca : parcalar) {
            parca =  parca.trim().replace("." , "")
            .replace(",", "")
            .replace("!", "")
                    .toLowerCase();

            if (!parca.isEmpty()) {
                kelimeler.add(parca);
            }
        }
        return kelimeler;
    }
    public static Set<String> benzersiz(List<String> kelimeler) {
        return new LinkedHashSet<>(kelimeler);
    }
    public static void secimAnalizi(int secim, List<String> kelimeler, Set<String> benzersiz, Scanner scanner) {
        switch(secim) {
            case 1:
                System.out.println("kelimeler: " + kelimeler);
                break;
                case 2:
                    System.out.println("benzersiz kelimeler: " + benzersiz);
                    break;
                    case 3:
                        System.out.println("aranacak kelimeyi girin:  ");
                        String aranacak = scanner.nextLine().trim();
                        System.out.println("tekrar sayısı: " + kelimeSayisiniBul(aranacak, kelimeler));
                        break;
                        case 4:
                            System.out.println("uzunluğu 4 den büyük olan kelimeler:  ");
                            uzunKelimeler(kelimeler);
                            break;
                            default:
                                System.out.println("geçersiz seçim yağtınız.");

        }

    }
    public static int kelimeSayisiniBul(String aranacak, List<String> kelimeler) {
        int sayac = 0;
        for (String kelime : kelimeler) {
            if(kelime.equalsIgnoreCase(aranacak)) {
                sayac++;
            }
        }
        return sayac;
    }
    public static void uzunKelimeler(List<String> kelimeler) {
        for(String kelime : kelimeler) {
            if (kelime.length() > 4) {
                System.out.println(kelime);
            }
        }
    }



    public static void main(String[] args) {
        /**
         * Kullanıcı bir cümle giriyor.
         * Örnek giriş:
         * Java öğrenmek eğlencelidir ama Java pratik yapmadan öğrenilmez
         * Programdan istenenler:
         * Cümleyi kelimelere ayırsın.
         * Tüm kelimeleri bir listede saklasın.
         * Aynı kelimeleri tekrarsız şekilde başka bir yapıda saklasın.
         * Her kelimeyi düzenleyip noktalama veya gereksiz boşlukları mümkün olduğunca temizlesin.
         * Kullanıcıdan analiz tipi alınsın:
         * 1 → Tüm kelimeleri yazdır
         * 2 → Tekrarsız kelimeleri yazdır
         * 3 → Belirli bir kelimenin kaç kez geçtiğini göster
         * 4 → Uzunluğu 4’ten büyük olan kelimeleri yazdır
         * Bu işlemlerin her biri metodlarla çözülsün.
         * Özellikle bir metod, verilen kelimenin listede kaç kez
         * geçtiğini hesaplasın.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle girin: ");
        String cumle = scanner.nextLine().trim();

        List<String> kelimeler = kelimelereAyir(cumle);

        Set<String> benzersiz = benzersiz(kelimeler);

        System.out.print("1-4 arası bir seçim yapın: ");

        int secim;

        scanner.nextLine();

        while (true) {
            System.out.println("1-4 arası bir seçim yapın: ");
            if(scanner.hasNextInt()) {                     //hasNextInt girilen değerin tam sayı olup olmamasına bakar.
                secim = scanner.nextInt();
                scanner.nextLine();  //buffer temizleme
                if (secim >= 1 || secim <= 4) {
                    secimAnalizi(secim, kelimeler, benzersiz, scanner);
                    break;

                }else {
                    System.out.println("lütfen 1-4 arası sayı girin");
                }
            }else {
                System.out.println("hatalı giriş yaptınız.");

                scanner.next();  // hatalı girilen değeri silip yenisini almak için kullandık.

            }

            System.out.print("1-4 arası bir seçim yapın: ");

            scanner.nextLine();
        }
        scanner.close();
    }
}
