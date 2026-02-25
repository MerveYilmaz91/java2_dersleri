package gun4;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        int a =10 , b = 4;
        System.out.println(a/b);
        System.out.println((double)a/b);
        System.out.println(a / (double) b);

        System.out.println("------soru2------");
        System.out.println(29%5);
        System.out.println(30%5);

        System.out.println("------soru3------");
        System.out.println(-7%3);   //-1
        System.out.println(7%3);    //1
        System.out.println(-7%-3);  //-1     kalan işaretini soldaki sayı belirler.

        System.out.println("------soru4------");
        int x = 5;
        System.out.println(x++);       //5
        System.out.println(++x);       //7
        System.out.println(x);         //7


        System.out.println("------soru5------");
        int r = 8 + 2 * 5 - 6 / 3;
        System.out.println(r);

        System.out.println("------soru6------");
        char c = 'A';
        System.out.println(c + 1);
        System.out.println((char)(c + 1));


        System.out.println("------soru7------");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.next();

        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);










    }
}
