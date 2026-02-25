package gun7;

import java.util.Scanner;

public class Asansor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int kat =1;
        System.out.print("Hedef kat: ");
        int hedef =scanner.nextInt();

        while (kat < hedef ) {
            kat++;
            System.out.println(kat + " .kattasin");
        }

        System.out.println("Hedef kata ulastin");



    }
}
