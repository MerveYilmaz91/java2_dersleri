package gun7;

import java.util.Scanner;

public class EmailKontolu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String mail;
        while(true){
            System.out.print("Email girin: ");
            mail=scanner.nextLine().trim().toLowerCase();

            int atIndex = mail.indexOf("@");
            if(atIndex <=0){
                System.out.print("@ isareti ile baslayamaz ve mail@ isareti icermeli ");
                continue;
            }
            if (!mail.contains("@") && !mail.endsWith(".com")){
                System.out.print("Email adresi @ isareti icermeli ve .com ile bitmeli ");
                continue;
            }
            System.out.print("Mail dogru girildi: " + mail);
            break;
        }



    }
}
