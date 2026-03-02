package gun9;

import java.util.Scanner;

public class OtobusKarti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Binis Gecmisi (T/O)");
        String input = scanner.nextLine().trim().toUpperCase();

        int toplamUcret = 0;
        int gecersizBinis = 0;
        int ogrenciBinis = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ',' || ch == ' ') {
                continue;

            }

            int ucret;
            switch (ch) {
                case 'T':
                    ucret = 20;
                    break;
                    case 'O':
                        ucret = 12;
                        ogrenciBinis++;
                        break;
                        default:
                            ucret = 0;
                            gecersizBinis++;
                            break;
            }
            toplamUcret += ucret;
        }
        System.out.println("Toplam ucret: " + toplamUcret);
        System.out.println("gecersizBinis: " + gecersizBinis);

        if (ogrenciBinis > 5) {
            System.out.println("ogrenci bonus binis kazandı");
        }
        scanner.close();
        
    }
}
