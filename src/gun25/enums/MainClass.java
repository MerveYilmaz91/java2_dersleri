package gun25.enums;

import gun21.SinavOrtalamasi;

public class MainClass {
    public static void main(String[] args) {
        Gun bugun = Gun.CUMA;

        System.out.println(bugun);

        TrafikIsıklari isik  = TrafikIsıklari.SARI;

        if(isik == TrafikIsıklari.KIRMIZI) {
            System.out.println("dur");
        } else if (isik== TrafikIsıklari.SARI) {
            System.out.println("kornaya bas");
        }else {
            System.out.println("geç");
        }

        Mevsimler mevsim = Mevsimler.ILKBAHAR;

        switch (mevsim) {
            case KIS:
                System.out.println("HAVA SOGUK");
                break;
                case YAZ:
                    System.out.println("HAVA SICAK");
                    break;
                    case ILKBAHAR:
                        System.out.println("HAVA ILIK");
                        break;
                        case SONBAHAR:
                            System.out.println("YAPRAKLAR DÖKÜLÜR");
                            break;

        }

        System.out.println("------------------");
        KahveBoyutu boyut = KahveBoyutu.BUYUK;
        System.out.println("seçilen kahve boyutu: " + boyut);
        System.out.println("fiyatı: " + boyut.fiyat);


        System.out.println("-------------------------");

        SiparisDurumu durum = SiparisDurumu.KARGODA;

        System.out.println("sipariş durumu: " + durum);
        System.out.println("açıklama: " + durum.aciklama);

        System.out.println("------------");

        Yon secim = Yon.GUNEY;
        System.out.println("yön: " + secim);
        System.out.println("açıklama: " + secim.yon);
    }
}
