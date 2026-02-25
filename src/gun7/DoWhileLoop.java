package gun7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;

        } while (i < 5);

        System.out.println("-------------");

        Scanner scanner=new Scanner(System.in);
        int secim;
        do {
            System.out.println("1 - Bakiye gör");
            System.out.println("2- para yatir");
            System.out.println("3- Cikis");
            System.out.println("Secim");
            secim=scanner.nextInt();
        } while (secim != 3);

        System.out.println("Program Sonlandi");

        System.out.println("------------");

        int x = 10;

        while(x<5) {
            System.out.println("While calisti");
        }

        do {
            System.out.println("do while calisti");
        } while (x<5);





    }
}
