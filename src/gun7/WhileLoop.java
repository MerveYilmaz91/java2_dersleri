package gun7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int x = 1;
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);


        int i= 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        System.out.print("sifre girin: ");
        String input = scanner.nextLine().trim();

        while (!input.equals(password)) {
            System.out.println("girilen sifre hatali, tekrar dene: ");
            System.out.print("sifre girin: ");
            input = scanner.nextLine().trim();
        }

        System.out.println("Giris basarili ");


    }
}
