package gun9;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class TelefonNumarasiMaskeleme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String telNO;

        do {
            System.out.println("Telefon numarasi girin");
            telNO=scanner.nextLine().trim();

            // bu işlem sonucunda elimizde sayılar kaldı.

            telNO=telNO
                    .replace("","")
                    .replace( " ","")
                    .replace( " ","");

            //0555-345-23-22 aradaki - leri sildikten sonra
            // if ve while sadece sayiların uzunluğuna bakar


            if (telNO.length() !=11) {
                System.out.println("tel no 11 haneli olmalı");

            }

        } while (telNO.length() !=11);
            String prefix = telNO.substring(0,4);
        String operator;

        switch (prefix) {
            case "0555":
                operator = "operatorA";
                break;
                case "0533":
                operator = "operatorB";
                break;
                default:
                    operator = "bilinmeyen operator";
                    break;

        }

        int count = 0;
        for (int i = 0; i<telNO.length();i++) {
            if (telNO.charAt(i) == '5') {
                count++;
            }
        }
        System.out.println("Operator: "  + operator);
        System.out.println("Tel no icerisindeki 5 miktari: " + count);

        if (count > 4) {
            System.out.println("cok fazla tekrar eden 5  var");
        }

        String masked = telNO.substring(0,4) + "****" + telNO.substring(8);
        System.out.println("Masked tel no: " + masked);

        scanner.close();

    }
}
