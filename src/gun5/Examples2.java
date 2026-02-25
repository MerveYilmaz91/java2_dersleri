package gun5;

import java.util.Scanner;

public class Examples2 {
    public static void main(String[] args) {
        System.out.println("----soru7----");
        Scanner scanner = new Scanner(System.in);

        String cumle = scanner.nextLine().trim();

        if (!cumle.endsWith(".")) {;
        cumle = cumle + ".";
        System.out.println(cumle);
        }

        System.out.println("----soru8----");
        String k = scanner.nextLine().trim();
        if (k.length() < 3) {
            System.out.println("Kisa");
        } else {
            System.out.println(k.substring(0,3));
        }

        System.out.println("----soru9----");

        System.out.println("sayi 1");
        int a = scanner.nextInt();
        System.out.println("sayi 2");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("yapmak istediginiz islemi giriniz(+,-,*)");
        String operations = scanner.nextLine().trim();

        if (operations.equals("+")) {
            System.out.println("Toplam: " + (a+b));
        } else if (operations.equals("-")) {
            System.out.println("cikarma: " + (a-b));
        } else if (operations.equals("*")) {
            System.out.println("carpma: " + (a*b));
        } else if (operations.equals("/")) {
            System.out.println("yanlis islem girildi: ");
        }

        System.out.println("----soru10----");

        System.out.print("ilk kelime: ");
        String x = scanner.nextLine();
        System.out.print("ikinci kelime: ");
        String y = scanner.nextLine();

        if(x.length() > y.length()) {
            System.out.println(x);
        } else if (y.length() > x.length()) {
            System.out.println(y);
            
        } else  {
            System.out.println("esit");
        }

        System.out.println("----soru11----");
        String fullname = scanner.nextLine().trim();

        int idx = fullname.indexOf(' ');
        if (idx == -1) {
            System.out.println("soyad yok");
        } else {
            System.out.println(fullname.substring(idx + 1));
        }









    }
}
